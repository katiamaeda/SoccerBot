
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/katiamaeda/Documents/workspace/IndiaBot/chromedriver");

		List<Integer> players = Arrays.asList(22139,198976,5879,7797,5957,49275,34239,23197,28022,16828,16902,21748,126422,6234,7109,99227);
		List<String> playersNames = Arrays.asList("Abdoulay Konko","Abou Diop","Adrian Mutu","Albano Bizzarri","Alberto Aquilani","Albin Ekdal","Aleandro Rosi","Alessandro Diamanti","Alessandro Lucarelli","Alessandro Potenza","Alessandro Rosina","Alessio Cerci","Allan Marques Loureiro","Amauri Carvalho De Oliveira","Andrea Barzagli","Andrea Bertolacci");

		ArrayList<Player> playerList = new ArrayList<Player>();

		for (int i = 0; i < players.size(); i++) {
			System.out.println("starting player = "+i);

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			try {
				driver.get("http://www.transfermarkt.com/patxi-punal/marktwertverlauf/spieler/" + players.get(i));
			} catch (Exception e1) {
				
				e1.printStackTrace();
				
				driver.get("http://www.transfermarkt.com/patxi-punal/marktwertverlauf/spieler/" + players.get(i));
			}
			String pageSource = driver.getPageSource();
			if (pageSource.contains("'series':[{")) {
				int start = pageSource.indexOf("'series':") + 9;
				int end = pageSource.indexOf("}}]}]") + 5;
				String data = pageSource.substring(start, end);
				System.out.println(data);

				try {
					JSONArray json = new JSONArray(data);

					if (json != null && json.length() > 0) {
						JSONObject reportObj =  json.optJSONObject(0);
						JSONArray dataObj = reportObj.getJSONArray("data");
						for (int k = 0; k < dataObj.length(); k++) {
							JSONObject playerObj = dataObj.optJSONObject(k);

							if (playerObj != null) {
								Player p = new Player();
								p.setId(players.get(i));
								if (i < playersNames.size()) {
									p.setName(playersNames.get(i));
								}
								p.setX(playerObj.optLong("x"));
								p.setY(playerObj.getLong("y"));
								p.setVerein(playerObj.getString("verein"));
								p.setAge(playerObj.getInt("age"));
								p.setMw(playerObj.getString("mw"));
								p.setDatum_mw(playerObj.getString("datum_mw"));
								
								JSONObject marketObj = playerObj.getJSONObject("marker");
								if (marketObj != null) {
									p.setMarker(marketObj.getString("symbol"));
								}
								
								playerList.add(p);
							}
						}
						
					}	
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
			driver.quit();
			
			System.out.println("finished player = "+i);
		}
		
		System.out.println("finished getting data");
		
		if (playerList.size() > 0) {
			String fileFolder = "/Users/katiamaeda/Downloads/";

			SXSSFWorkbook workbook = new SXSSFWorkbook(); 
			Sheet excelSheet = workbook.createSheet("Sheet");
			int row_num = 0;
			int col_num = 0;

			Row row = null;
			
			row = excelSheet.createRow(row_num++);
			addLabel(col_num++, row, "Id");
			addLabel(col_num++, row, "Name");
			addLabel(col_num++, row, "Age");
			addLabel(col_num++, row, "Club");
			addLabel(col_num++, row, "Market Value");
			addLabel(col_num++, row, "MV Date");

			for (Player player : playerList) {
				col_num = 0;
				row = excelSheet.createRow(row_num++);
				addLabel(col_num++, row, ""+player.getId());
				addLabel(col_num++, row, player.getName());
				addLabel(col_num++, row, ""+player.getAge());
				addLabel(col_num++, row, player.getVerein());
				addLabel(col_num++, row, player.getMw());
				addLabel(col_num++, row, player.getDatum_mw());
			}

			try {
				String inputFile2 = fileFolder+"/Market Value.xlsx";
				FileOutputStream out = new FileOutputStream(inputFile2);
				workbook.write(out);
				out.flush();
				out.close();
				workbook.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Check the title of the page
		System.out.println("finished all");

	}

	private static void addLabel(int column, Row row, String s) {

		Cell cell = row.createCell(column);
		cell.setCellValue(s);
	}
}
