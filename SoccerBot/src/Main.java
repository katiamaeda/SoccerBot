
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/katiamaeda/git/SoccerBot/SoccerBot/chromedriver");

		List<Integer> players = Arrays.asList(22139,198976,5879,7797,5957,49275,34239,23197,28022,16828,16902,21748,126422,55957,6234,52897,7109,99227,6098,35865,21861,34336,35849,19442,102777,21935,5817,44834,44327,29213,52918,48002,39828,160825,21779,25488,5962,16893,22141,85066,37666,9967,44317,44675,40372,19708,24606,33442,76387,50791,89783,5946,16870,3507,21151,20941,38584,105521,44716,221815,4314,6438,22249,34344,5948,110577,35583,5856,20730,5947,29962,7096,35853,21696,140748,32816,5970,6076,5896,87210,22186,38824,56903,22202,87493,20378,177843,22140,18301,19694,16120,22268,5755,24316,16651,111630,56609,7520,75127,96754,89027,6097,54794,126656,21876,163639,85475,22318,21763,17127,83891,26460,38954,5935,6033,7093,5974,22320,35733,5958,41989,16137,91716,114340,30767,43084,6157,21770,30873,33481,57280,5893,16744,21872,84846,5023,22598,138110,29260,21887,5793,21756,57354,20913,6717,735,130172,19104,52328,19998,12563,22093,6428,21782,207715,16631,66022,111039,46105,8885,1161,45581,54149,53477,80351,7825,87469,121985,91970,39118,37941,22412,74943,3430,46552,35645,43760,16922,63531,54929,39983,63824,7499,12149,146743,45565,6792,41994,33218,22210,60128,26721,105892,6233,77,57389,119228,56036,4311,39917,6090,57643,36356,201040,47646,5825,164091,16975,6427,5873,30333,84545,21955,33605,85528,181767,38593,35491,30853,45146,160357,6721,5507,3515,5818,5870,28020,5837,28026,17396,5868,25318,54906,21859,88682,88683,110923,20003,6160,6750,28823,26263,30687,45124,28862,30593,12906,47544,56841,19438,17130,33042,211397,76799,19083,44162,6448,10,41749,6747,56790,47085,5925,171399,42796,82048,38591,52903,51186,131709,73097,19946,37389,55993,19636,62415,5858,16891,44709,7101,122153,101213,37295,5422,52999,3366,76077,29604,28936,19446,43411,5976,63186,15511,39099,5768,121756,19182,21769,28021,42744,90489,144779,52312,61449,5890,30638,5928,30690,88590,1599,76061,48859,41312,88706,21701,96828,44420,107010,6012,6043,2865,46104,4793,17129,109598,5889,28868,21752,6026,94305,21905,26105,9850,72274,92701,92141,52266,5938,50477,79522,37278,3455,37418);
		List<String> playersId = Arrays.asList("p17886","p109830","p4193","p8278","p18372","p50779","p20069","p45129","p10195","p17177","p15761","p18018","p119765","p48863","p9082","p49822","p17172","p60073","p10120","p18500","p7473","p38558","p17824","p18227","p62379","p15642","p7313","p39830","p39167","p37146","p52498","p40669","p21232","p77208","p4183","p45156","p7174","p4047","p12730","p60782","p42565","p32269","p37413","p40276","p27794","p39329","p21102","p32493","p50902","p46142","p88632","p3838","p7228","p4242","p8522","p18420","p18232","p59046","p20113","p116110","p4043","p11871","p18502","p27300","p10624","p61193","p39942","p7261","p18109","p10625","p19936","p15842","p27617","p18381","p84619","p53686","p7328","p10450","p7459","p50761","p21140","p27702","p75804","p26746","p72073","p13243","p116796","p12672","p18573","p20007","p14404","p9793","p7823","p17746","p1037","p62974","p46847","p13919","p54795","p77454","p55201","p13158","p48256","p88746","p14783","p90557","p57145","p38479","p38476","p17319","p95712","p32656","p19975","p4205","p13525","p14715","p7360","p21154","p18535","p4177","p38867","p17847","p90719","p100632","p37641","p38588","p7158","p38162","p48850","p43274","p49417","p7458","p14739","p7485","p50840","p4126","p18526","p108443","p18102","p21133","p14754","p19712","p40846","p18414","p7437","p14733","p87916","p18222","p46532","p18352","p15061","p17856","p10289","p14880","p119908","p18547","p85188","p76240","p40436","p12057","p7321","p60068","p53406","p55844","p55712","p8432","p59140","p91990","p66733","p42947","p42738","p19928","p69143","p8647","p71403","p28673","p38817","p20360","p49485","p61021","p28277","p51950","p5857","p16106","p105131","p39999","p17311","p11454","p18362","p21142","p47545","p39462","p60715","p7202","p8491","p21198","p87750","p104276","p10318","p37786","p7152","p42886","p20074","p122476","p40742","p14731","p87844","p8515","p8859","p10185","p19713","p51221","p7293","p20045","p56486","p116406","p19802","p21150","p39783","p42493","p109389","p12436","p12204","p4854","p4170","p7218","p18237","p7484","p18361","p18155","p6852","p18548","p40002","p12728","p107013","p60071","p87995","p49299","p17176","p8367","p21199","p19787","p55831","p28552","p14509","p37368","p37740","p42161","p41352","p18226","p17325","p49666","p168711","p52153","p38882","p46696","p7347","p5155","p39453","p17313","p56511","p62396","p11700","p105108","p38597","p81033","p38808","p49311","p55523","p116120","p50822","p51034","p37979","p19968","p39471","p52857","p7379","p9796","p19581","p17178","p74208","p59779","p39481","p6274","p53309","p13135","p86444","p17448","p19480","p18229","p38556","p8704","p59920","p15107","p20153","p13242","p72738","p18401","p21153","p18383","p42825","p57345","p82752","p40283","p52049","p11477","p28592","p10729","p42899","p69140","p13306","p68353","p48714","p37746","p82334","p10976","p60270","p27353","p65807","p13663","p13501","p27335","p50442","p41909","p14791","p73799","p7454","p39083","p14216","p13530","p91943","p21123","p37412","p39464","p49940","p59306","p59380","p37510","p7441","p41321","p78407","p62388","p9808","p28502");
		List<String> playersNames = Arrays.asList("Abdoulay Konko","Abou Diop","Adrian Mutu","Albano Bizzarri","Alberto Aquilani","Albin Ekdal","Aleandro Rosi","Alessandro Diamanti","Alessandro Lucarelli","Alessandro Potenza","Alessandro Rosina","Alessio Cerci","Allan Marques Loureiro","Alvaro Gonz·lez","Amauri Carvalho De Oliveira","Anderson Hernanes de Carvalho Andrade Lima","Andrea Barzagli","Andrea Bertolacci","Andrea Caracciolo","Andrea Consigli","Andrea Cossu","Andrea Costa","Andrea Esposito","Andrea Lazzari","Andrea Lisuzzo","Andrea Mantovani","Andrea Pirlo","Andrea Poli","Andrea Ranocchia","Andreas Granqvist","AndrÈ Goncalves Dias","Angelo Ogbonna","Antonino Barill‡","Antonio Balzano","Antonio Bocchetti","Antonio Candreva","Antonio Cassano","Antonio Floro Flores","Antonio Mirante","Archimede Morleo","Arturo Vidal","Blerim Dzemaili","Bojan Jokic","Bojan Krkic","Borja Valero Iglesias","Bosko Jankovic","Bostjan Cesar","Boukary DramÈ","Carlos Carmona","Carlos Grossm¸ller","Carlos Labrin","Cesare Bovo","Cesare Natali","Christian Abbiati","Christian Maggio","Christian Terlizzi","Ciro Capuano","Ciro Immobile","Claudio Marchisio","Constantin Nica","Cristian Chivu","Cristian Ledesma","Cristian Raimondi","Cristian Zapata","Damiano Ferronetti","Damiano Zanon","Daniel Pudil","Daniele Bonera","Daniele Conti","Daniele De Rossi","Daniele Dessena","Daniele Gastaldello","Daniele Paponi","Daniele Portanova","Danilo Avelar","Danilo Larangeira","Dario Dainelli","David Di Michele","David Pizarro","Davide Astori","Davide Biondini","Davide Brivio","Diego Fabbrini","Diego Milito","Diego Novaretti","Diego PÈrez","Domenico Berardi","Domenico Maietta","Douglas Maicon","Dusan Basta","Edgar Barreto","Emanuele CalaiÚ","Emiliano Moretti","Emiliano Viviano","Enzo Maresca","Erik Lamela","Eros Pisano","Esteban Cambiasso","Ezequiel MuÒoz","Fabio Borini","Fabi·n Rinaudo","Fabrizio Miccoli","Facundo Parra","Faouzi Ghoulam","Federico Balzaretti","Federico Ceccherini","Federico Fern·ndez","Federico Marchetti","Federico Peluso","Felipe Dias Da Silva Dal Belo","Felipe Seymour","Fernando Belluschi","Fernando Gago","Francesco Antonioli","Francesco Lodi","Francesco Magnanelli","Francesco Matuzalem","Francesco Modesto","Francesco Pisano","Francesco Totti","Francesco Valiani","Franco Brienza","Frederik Sorensen","Gabriel MoisÈs Antunes da Silva","Gabriel Paletta","Gaetano Berardi","Gaetano D'Agostino","Gennaro Sardo","Germ·n Denis","Gervais Kouassi","Giacomo Bonaventura","Giampiero Pinzi","Giandomenico Mesto","Gianluca Pegolo","Gianluca Sansone","Gianluigi Buffon","Gianni Munari","Gino Peruzzi","Giorgio Chiellini","Giovanni Marchese","Giovanni Pasquale","Giulio Migliaccio","Giuseppe Bellusci","Giuseppe Biava","Giuseppe Colucci","Giuseppe Gemiti","Giuseppe Rizzo","Giuseppe Rossi","Gonzalo Bergessio","Gonzalo RodrÌguez","Goran Pandev","Guglielmo Stendardo","Guillermo Giacomazzi","Hugo Campagnaro","Ibrahima Mbaye","Ignazio Abate","Innocent Emeghara","Ishak Belfodil","Ivan Radovanovic","Jaroslav Plasil","Javier Zanetti","Joel Chukwuma Obi","Jonathan Cicero Moreira","Jonathan Cristaldo","Josip Ilicic","JosÈ Reina","JosÈ ¡ngel ValdÈs DÌaz","Juan Guilherme Nunes Jesus","Juan Guillermo Cuadrado","Juan Pablo Carrizo","Juan ZuÒiga","Julio CÈsar","Juraj Kucka","Kakha Kaladze","Kamil Glik","Kamil Vacek","Kevin Constant","Kevin-Prince Boateng","Kwadwo Asamoah","Leandro Castan da Silva","Leonardo Bonucci","Libor Koz·k","Lionel Scaloni","Lorik Cana","Luca Antei","Luca Antonelli","Luca Antonini","Luca Ceccarelli","Luca Cigarini","Luca Rigoni","Luca Rossettini","Lucas Biglia","Lucas Castro","Luciano Siqueira de Oliveira","Lucimar Ferreira da Silva","Luigi Giorgi","Luis Muriel","LuÌs Neto","Maarten Stekelenburg","Mamadou Samassa","Manuele Blasi","Marcello Gazzola","Marco Andreolli","Marco Benassi","Marco Biagianti","Marco Borriello","Marco Capuano","Marco Cassetti","Marco Donadel","Marco Marchionni","Marco Motta","Marco Parolo","Marco Rossi","Marco Rossi","Marco Silvestri","Marcos Aoas Correa","Marek Hamsik","Mariano Andujar","Mariano Izco","Mario Balotelli","Mario Sampirisi","Mario Santana","Mario Yepes","Mark van Bommel","Massimo Ambrosini","Massimo Donati","Massimo Gobbi","Massimo Oddo","Massimo Paci","Mathieu Flamini","Matteo Brighi","Matteo Contini","Matteo Darmian","Mattia Cassani","Mattia De Sciglio","Mattia Destro","Mattia Perin","MatÌas Silvestre","Mauricio Pinilla","Maurizio Domizzi","Maurizio Lauro","Maxi LÛpez","Maximiliano Moralez","Mehdi Benatia","Michael Agazzi","Michael Bradley","MichaÎl Ciani","Michel Morganella","Michelangelo Albertazzi","Michele Canini","Michele Pazienza","Migjen Basha","Miguel Borja","Miguel Britos","Mikael Antonsson","Miralem Pjanic","Mirko Vucinic","Miroslav Klose","Mobido DiakitÈ","Moris Carrozzieri","Nenad Krsticic","Nenad Tomovic","Nicola Legrottaglie","Nicola Murru","Nicola Ravaglia","Nicola Sansone","Nicolas Frey","Nicol‡s Bertolo","Nicol·s Spolli","Ogenyi Onazi","Omar El Kaddouri","Pablo Barrientos","Pablo Osvaldo","Pablo Sebasti·n ¡lvarez","Panagiotis Kone","Panagiotis Tachtsidis","Paolo Cannavaro","Paolo Castellini","Paolo De Ceglie","Paolo Sammarco","Paul Pogba","Pedro Mba Obiang","Perparim Hetemaj","Philippe Mexes","Renan Fernandes Garcia","Ricardo Izecson Dos Santos Leite","Ricardo ¡lvarez","Riccardo Cazzola","Riccardo Meggiorini","Riccardo Montolivo","Roberto Colombo","Roberto Guana","Roberto Soriano","Robson de Souza","Rodrigo Palacio","Ruben Ariel Olivera da Rosa","RÙmulo Souza Orestes Caldeira","Salvatore Aronica","Salvatore Masiello","Samir Handanovic","Samir Ujkani","Santiago Garcia","Saphir Sliti Taider","Sebastian Giovinco","Senad Lulic","Sergio AlmirÛn","Sergio Floccari","Sergio Pellissier","Sergio Romero","Shkodran Mustafi","Silveira dos Santos Juan","Sime Vrsaljko","Simon Kjaer","Simone Pesce","Simone Romagnoli","Simone Vergassola","Simone Zaza","Stefan Radu","Stefan Savic","Stefano Lucchini","Stefano Mauri","Stephan Lichtsteiner","Stevan Jovetic","Steve Von Bergen","Sulley Ali Muntari","Thomas Heurtaux","Thomas Manfredini","Tiberio Guarente","Tommaso Berni","Tommaso Rocchi","Uros Cosic","Valon Behrami","Valter Birsa","Vangelis Moras","Vasco Regini","Vladimir Weiss","VÌctor Ibarbo","Walter Gargano","Walter Samuel","Yohan Benalouane","Yuto Nagatomo","Zeljko Brkic","Zlatan Ibrahimovic","…der Citadin Martins");

		ArrayList<Player> playerList = new ArrayList<Player>();
		ArrayList<Integer> problemList = new ArrayList<Integer>();

		for (int i = 0; i < players.size(); i++) {
			System.out.println("starting player = "+i);

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			try {
				driver.get("http://www.transfermarkt.com/patxi-punal/profil/spieler/" + players.get(i));
			} catch (Exception e1) {
				problemList.add(i);
				e1.printStackTrace();
				continue;
			}
			
			Player initPlayer = new Player();
			try {
				WebElement table_element = driver.findElement(By.xpath("//table[@class='auflistung']"));
				List<WebElement> tr_collection = table_element.findElements(By.tagName("tr"));
				
				for(WebElement trElement : tr_collection) {
					List<WebElement> thList = trElement.findElements(By.tagName("th"));
					List<WebElement> tdList = trElement.findElements(By.tagName("td"));
				    if (thList == null || thList.size() <= 0 || tdList == null || tdList.size() <= 0) {
				    	continue;
				    }

				    WebElement thElement = thList.get(0);
				    WebElement tdElement = tdList.get(0);
				    String fieldName = thElement.getText();
				    fieldName = fieldName.trim();
				    switch (fieldName) {
				    	case "Name in home country:": initPlayer.setFullName(tdElement.getText());
				    	case "Date of birth:": initPlayer.setDateOfBirth(tdElement.getText());
				    	case "Height:": initPlayer.setHeight(tdElement.getText());
				    	case "Nationality:": initPlayer.setNationality(tdElement.getText());
				    	case "Position:": initPlayer.setPosition(tdElement.getText());
				    	case "Foot:": initPlayer.setFoot(tdElement.getText());
				    	case "Current club:": initPlayer.setCurrentClub(tdElement.getText());
				    	case "In the team since:": initPlayer.setInTeamSince(tdElement.getText());
				    	case "Contract until:": initPlayer.setContractUntill(tdElement.getText());
				    	case "Date of last contract extension:": initPlayer.setLastContractExtension(tdElement.getText());
				    }
				}
			} catch (Exception e) {

			}
			
			try {
				driver.get("http://www.transfermarkt.com/patxi-punal/marktwertverlauf/spieler/" + players.get(i));
			} catch (Exception e1) {
				problemList.add(i);
				e1.printStackTrace();
				continue;
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
								if (i < playersId.size()) {
									p.setId2(playersId.get(i));
								}
								if (i < playersNames.size()) {
									p.setName(playersNames.get(i));
								}
								p.setX(playerObj.optLong("x"));
								p.setY(playerObj.getLong("y"));
								p.setVerein(playerObj.getString("verein"));
								p.setAge(playerObj.getInt("age"));
								p.setMw(playerObj.getString("mw"));
								p.setDatum_mw(playerObj.getString("datum_mw"));
								
								if (initPlayer != null) {
									p.setFullName(initPlayer.getFullName());
									p.setDateOfBirth(initPlayer.getDateOfBirth());
									p.setHeight(initPlayer.getHeight());
									p.setNationality(initPlayer.getNationality());
									p.setPosition(initPlayer.getPosition());
									p.setFoot(initPlayer.getFoot());
									p.setCurrentClub(initPlayer.getCurrentClub());
									p.setInTeamSince(initPlayer.getInTeamSince());
									p.setContractUntill(initPlayer.getContractUntill());
									p.setLastContractExtension(initPlayer.getLastContractExtension());
								}
								
								JSONObject marketObj = playerObj.getJSONObject("marker");
								if (marketObj != null) {
									p.setMarker(marketObj.getString("symbol"));
								}
								
								playerList.add(p);
							} else {
								System.out.println("Problem player " + i + " no series");
								problemList.add(i);
							}
						}
						
					} else {
						System.out.println("Problem player " + i + " no series");
						problemList.add(i);
					}	
				} catch (JSONException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Problem player " + i + " no series");
				problemList.add(i);
			}

			driver.quit();
			
			System.out.println("finished player = "+i);
		}
		
		for (Integer i : problemList) {
			System.out.println("Problem with player = "+i);
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
			addLabel(col_num++, row, "Id2");
			addLabel(col_num++, row, "Name");
			addLabel(col_num++, row, "Age");
			addLabel(col_num++, row, "Club");
			addLabel(col_num++, row, "Market Value");
			addLabel(col_num++, row, "MV Date");
			
			addLabel(col_num++, row, "Coutry name");
			addLabel(col_num++, row, "Date of Birth");
			addLabel(col_num++, row, "Height");
			addLabel(col_num++, row, "Nationality");
			addLabel(col_num++, row, "Position");
			addLabel(col_num++, row, "Foot");
			addLabel(col_num++, row, "Current Club");
			addLabel(col_num++, row, "In team since");
			addLabel(col_num++, row, "Contract until");
			addLabel(col_num++, row, "Last contract extension");

			for (Player player : playerList) {
				col_num = 0;
				row = excelSheet.createRow(row_num++);
				addLabel(col_num++, row, ""+player.getId());
				addLabel(col_num++, row, ""+player.getId2());
				addLabel(col_num++, row, player.getName());
				addLabel(col_num++, row, ""+player.getAge());
				addLabel(col_num++, row, player.getVerein());
				addLabel(col_num++, row, player.getMw());
				addLabel(col_num++, row, player.getDatum_mw());
				
				addLabel(col_num++, row, player.getFullName());
				addLabel(col_num++, row, player.getDateOfBirth());
				addLabel(col_num++, row, player.getHeight());
				addLabel(col_num++, row, player.getNationality());
				addLabel(col_num++, row, player.getPosition());
				addLabel(col_num++, row, player.getFoot());
				addLabel(col_num++, row, player.getCurrentClub());
				addLabel(col_num++, row, player.getInTeamSince());
				addLabel(col_num++, row, player.getContractUntill());
				addLabel(col_num++, row, player.getLastContractExtension());
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
