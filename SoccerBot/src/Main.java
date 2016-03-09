
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

//		List<Integer> players = Arrays.asList(22139,198976,5879,7797,5957,49275,34239,23197,28022,16828,16902,21748,126422,55957,6234,52897,7109,99227,6098,35865,21861,34336,35849,19442,102777,21935,5817,44834,44327,29213,52918,48002,39828,160825,21779,25488,5962,16893,22141,85066,37666,9967,44317,44675,40372,19708,24606,33442,76387,50791,89783,5946,16870,3507,21151,20941,38584,105521,44716,221815,4314,6438,22249,34344,5948,110577,35583,5856,20730,5947,29962,7096,35853,21696,140748,32816,5970,6076,5896,87210,22186,38824,56903,22202,87493,20378,177843,22140,18301,19694,16120,22268,5755,24316,16651,111630,56609,7520,75127,96754,89027,6097,54794,126656,21876,163639,85475,22318,21763,17127,83891,26460,38954,5935,6033,7093,5974,22320,35733,5958,41989,16137,91716,114340,30767,43084,6157,21770,30873,33481,57280,5893,16744,21872,84846,5023,22598,138110,29260,21887,5793,21756,57354,20913,6717,735,130172,19104,52328,19998,12563,22093,6428,21782,207715,16631,66022,111039,46105,8885,1161,45581,54149,53477,80351,7825,87469,121985,91970,39118,37941,22412,74943,3430,46552,35645,43760,16922,63531,54929,39983,63824,7499,12149,146743,45565,6792,41994,33218,22210,60128,26721,105892,6233,77,57389,119228,56036,4311,39917,6090,57643,36356,201040,47646,5825,164091,16975,6427,5873,30333,84545,21955,33605,85528,181767,38593,35491,30853,45146,160357,6721,5507,3515,5818,5870,28020,5837,28026,17396,5868,25318,54906,21859,88682,88683,110923,20003,6160,6750,28823,26263,30687,45124,28862,30593,12906,47544,56841,19438,17130,33042,211397,76799,19083,44162,6448,10,41749,6747,56790,47085,5925,171399,42796,82048,38591,52903,51186,131709,73097,19946,37389,55993,19636,62415,5858,16891,44709,7101,122153,101213,37295,5422,52999,3366,76077,29604,28936,19446,43411,5976,63186,15511,39099,5768,121756,19182,21769,28021,42744,90489,144779,52312,61449,5890,30638,5928,30690,88590,1599,76061,48859,41312,88706,21701,96828,44420,107010,6012,6043,2865,46104,4793,17129,109598,5889,28868,21752,6026,94305,21905,26105,9850,72274,92701,92141,52266,5938,50477,79522,37278,3455,37418);
//		List<String> playersId = Arrays.asList("p17886","p109830","p4193","p8278","p18372","p50779","p20069","p45129","p10195","p17177","p15761","p18018","p119765","p48863","p9082","p49822","p17172","p60073","p10120","p18500","p7473","p38558","p17824","p18227","p62379","p15642","p7313","p39830","p39167","p37146","p52498","p40669","p21232","p77208","p4183","p45156","p7174","p4047","p12730","p60782","p42565","p32269","p37413","p40276","p27794","p39329","p21102","p32493","p50902","p46142","p88632","p3838","p7228","p4242","p8522","p18420","p18232","p59046","p20113","p116110","p4043","p11871","p18502","p27300","p10624","p61193","p39942","p7261","p18109","p10625","p19936","p15842","p27617","p18381","p84619","p53686","p7328","p10450","p7459","p50761","p21140","p27702","p75804","p26746","p72073","p13243","p116796","p12672","p18573","p20007","p14404","p9793","p7823","p17746","p1037","p62974","p46847","p13919","p54795","p77454","p55201","p13158","p48256","p88746","p14783","p90557","p57145","p38479","p38476","p17319","p95712","p32656","p19975","p4205","p13525","p14715","p7360","p21154","p18535","p4177","p38867","p17847","p90719","p100632","p37641","p38588","p7158","p38162","p48850","p43274","p49417","p7458","p14739","p7485","p50840","p4126","p18526","p108443","p18102","p21133","p14754","p19712","p40846","p18414","p7437","p14733","p87916","p18222","p46532","p18352","p15061","p17856","p10289","p14880","p119908","p18547","p85188","p76240","p40436","p12057","p7321","p60068","p53406","p55844","p55712","p8432","p59140","p91990","p66733","p42947","p42738","p19928","p69143","p8647","p71403","p28673","p38817","p20360","p49485","p61021","p28277","p51950","p5857","p16106","p105131","p39999","p17311","p11454","p18362","p21142","p47545","p39462","p60715","p7202","p8491","p21198","p87750","p104276","p10318","p37786","p7152","p42886","p20074","p122476","p40742","p14731","p87844","p8515","p8859","p10185","p19713","p51221","p7293","p20045","p56486","p116406","p19802","p21150","p39783","p42493","p109389","p12436","p12204","p4854","p4170","p7218","p18237","p7484","p18361","p18155","p6852","p18548","p40002","p12728","p107013","p60071","p87995","p49299","p17176","p8367","p21199","p19787","p55831","p28552","p14509","p37368","p37740","p42161","p41352","p18226","p17325","p49666","p168711","p52153","p38882","p46696","p7347","p5155","p39453","p17313","p56511","p62396","p11700","p105108","p38597","p81033","p38808","p49311","p55523","p116120","p50822","p51034","p37979","p19968","p39471","p52857","p7379","p9796","p19581","p17178","p74208","p59779","p39481","p6274","p53309","p13135","p86444","p17448","p19480","p18229","p38556","p8704","p59920","p15107","p20153","p13242","p72738","p18401","p21153","p18383","p42825","p57345","p82752","p40283","p52049","p11477","p28592","p10729","p42899","p69140","p13306","p68353","p48714","p37746","p82334","p10976","p60270","p27353","p65807","p13663","p13501","p27335","p50442","p41909","p14791","p73799","p7454","p39083","p14216","p13530","p91943","p21123","p37412","p39464","p49940","p59306","p59380","p37510","p7441","p41321","p78407","p62388","p9808","p28502");
//		List<String> playersNames = Arrays.asList("Abdoulay Konko","Abou Diop","Adrian Mutu","Albano Bizzarri","Alberto Aquilani","Albin Ekdal","Aleandro Rosi","Alessandro Diamanti","Alessandro Lucarelli","Alessandro Potenza","Alessandro Rosina","Alessio Cerci","Allan Marques Loureiro","Alvaro Gonz·lez","Amauri Carvalho De Oliveira","Anderson Hernanes de Carvalho Andrade Lima","Andrea Barzagli","Andrea Bertolacci","Andrea Caracciolo","Andrea Consigli","Andrea Cossu","Andrea Costa","Andrea Esposito","Andrea Lazzari","Andrea Lisuzzo","Andrea Mantovani","Andrea Pirlo","Andrea Poli","Andrea Ranocchia","Andreas Granqvist","AndrÈ Goncalves Dias","Angelo Ogbonna","Antonino Barill‡","Antonio Balzano","Antonio Bocchetti","Antonio Candreva","Antonio Cassano","Antonio Floro Flores","Antonio Mirante","Archimede Morleo","Arturo Vidal","Blerim Dzemaili","Bojan Jokic","Bojan Krkic","Borja Valero Iglesias","Bosko Jankovic","Bostjan Cesar","Boukary DramÈ","Carlos Carmona","Carlos Grossm¸ller","Carlos Labrin","Cesare Bovo","Cesare Natali","Christian Abbiati","Christian Maggio","Christian Terlizzi","Ciro Capuano","Ciro Immobile","Claudio Marchisio","Constantin Nica","Cristian Chivu","Cristian Ledesma","Cristian Raimondi","Cristian Zapata","Damiano Ferronetti","Damiano Zanon","Daniel Pudil","Daniele Bonera","Daniele Conti","Daniele De Rossi","Daniele Dessena","Daniele Gastaldello","Daniele Paponi","Daniele Portanova","Danilo Avelar","Danilo Larangeira","Dario Dainelli","David Di Michele","David Pizarro","Davide Astori","Davide Biondini","Davide Brivio","Diego Fabbrini","Diego Milito","Diego Novaretti","Diego PÈrez","Domenico Berardi","Domenico Maietta","Douglas Maicon","Dusan Basta","Edgar Barreto","Emanuele CalaiÚ","Emiliano Moretti","Emiliano Viviano","Enzo Maresca","Erik Lamela","Eros Pisano","Esteban Cambiasso","Ezequiel MuÒoz","Fabio Borini","Fabi·n Rinaudo","Fabrizio Miccoli","Facundo Parra","Faouzi Ghoulam","Federico Balzaretti","Federico Ceccherini","Federico Fern·ndez","Federico Marchetti","Federico Peluso","Felipe Dias Da Silva Dal Belo","Felipe Seymour","Fernando Belluschi","Fernando Gago","Francesco Antonioli","Francesco Lodi","Francesco Magnanelli","Francesco Matuzalem","Francesco Modesto","Francesco Pisano","Francesco Totti","Francesco Valiani","Franco Brienza","Frederik Sorensen","Gabriel MoisÈs Antunes da Silva","Gabriel Paletta","Gaetano Berardi","Gaetano D'Agostino","Gennaro Sardo","Germ·n Denis","Gervais Kouassi","Giacomo Bonaventura","Giampiero Pinzi","Giandomenico Mesto","Gianluca Pegolo","Gianluca Sansone","Gianluigi Buffon","Gianni Munari","Gino Peruzzi","Giorgio Chiellini","Giovanni Marchese","Giovanni Pasquale","Giulio Migliaccio","Giuseppe Bellusci","Giuseppe Biava","Giuseppe Colucci","Giuseppe Gemiti","Giuseppe Rizzo","Giuseppe Rossi","Gonzalo Bergessio","Gonzalo RodrÌguez","Goran Pandev","Guglielmo Stendardo","Guillermo Giacomazzi","Hugo Campagnaro","Ibrahima Mbaye","Ignazio Abate","Innocent Emeghara","Ishak Belfodil","Ivan Radovanovic","Jaroslav Plasil","Javier Zanetti","Joel Chukwuma Obi","Jonathan Cicero Moreira","Jonathan Cristaldo","Josip Ilicic","JosÈ Reina","JosÈ ¡ngel ValdÈs DÌaz","Juan Guilherme Nunes Jesus","Juan Guillermo Cuadrado","Juan Pablo Carrizo","Juan ZuÒiga","Julio CÈsar","Juraj Kucka","Kakha Kaladze","Kamil Glik","Kamil Vacek","Kevin Constant","Kevin-Prince Boateng","Kwadwo Asamoah","Leandro Castan da Silva","Leonardo Bonucci","Libor Koz·k","Lionel Scaloni","Lorik Cana","Luca Antei","Luca Antonelli","Luca Antonini","Luca Ceccarelli","Luca Cigarini","Luca Rigoni","Luca Rossettini","Lucas Biglia","Lucas Castro","Luciano Siqueira de Oliveira","Lucimar Ferreira da Silva","Luigi Giorgi","Luis Muriel","LuÌs Neto","Maarten Stekelenburg","Mamadou Samassa","Manuele Blasi","Marcello Gazzola","Marco Andreolli","Marco Benassi","Marco Biagianti","Marco Borriello","Marco Capuano","Marco Cassetti","Marco Donadel","Marco Marchionni","Marco Motta","Marco Parolo","Marco Rossi","Marco Rossi","Marco Silvestri","Marcos Aoas Correa","Marek Hamsik","Mariano Andujar","Mariano Izco","Mario Balotelli","Mario Sampirisi","Mario Santana","Mario Yepes","Mark van Bommel","Massimo Ambrosini","Massimo Donati","Massimo Gobbi","Massimo Oddo","Massimo Paci","Mathieu Flamini","Matteo Brighi","Matteo Contini","Matteo Darmian","Mattia Cassani","Mattia De Sciglio","Mattia Destro","Mattia Perin","MatÌas Silvestre","Mauricio Pinilla","Maurizio Domizzi","Maurizio Lauro","Maxi LÛpez","Maximiliano Moralez","Mehdi Benatia","Michael Agazzi","Michael Bradley","MichaÎl Ciani","Michel Morganella","Michelangelo Albertazzi","Michele Canini","Michele Pazienza","Migjen Basha","Miguel Borja","Miguel Britos","Mikael Antonsson","Miralem Pjanic","Mirko Vucinic","Miroslav Klose","Mobido DiakitÈ","Moris Carrozzieri","Nenad Krsticic","Nenad Tomovic","Nicola Legrottaglie","Nicola Murru","Nicola Ravaglia","Nicola Sansone","Nicolas Frey","Nicol‡s Bertolo","Nicol·s Spolli","Ogenyi Onazi","Omar El Kaddouri","Pablo Barrientos","Pablo Osvaldo","Pablo Sebasti·n ¡lvarez","Panagiotis Kone","Panagiotis Tachtsidis","Paolo Cannavaro","Paolo Castellini","Paolo De Ceglie","Paolo Sammarco","Paul Pogba","Pedro Mba Obiang","Perparim Hetemaj","Philippe Mexes","Renan Fernandes Garcia","Ricardo Izecson Dos Santos Leite","Ricardo ¡lvarez","Riccardo Cazzola","Riccardo Meggiorini","Riccardo Montolivo","Roberto Colombo","Roberto Guana","Roberto Soriano","Robson de Souza","Rodrigo Palacio","Ruben Ariel Olivera da Rosa","RÙmulo Souza Orestes Caldeira","Salvatore Aronica","Salvatore Masiello","Samir Handanovic","Samir Ujkani","Santiago Garcia","Saphir Sliti Taider","Sebastian Giovinco","Senad Lulic","Sergio AlmirÛn","Sergio Floccari","Sergio Pellissier","Sergio Romero","Shkodran Mustafi","Silveira dos Santos Juan","Sime Vrsaljko","Simon Kjaer","Simone Pesce","Simone Romagnoli","Simone Vergassola","Simone Zaza","Stefan Radu","Stefan Savic","Stefano Lucchini","Stefano Mauri","Stephan Lichtsteiner","Stevan Jovetic","Steve Von Bergen","Sulley Ali Muntari","Thomas Heurtaux","Thomas Manfredini","Tiberio Guarente","Tommaso Berni","Tommaso Rocchi","Uros Cosic","Valon Behrami","Valter Birsa","Vangelis Moras","Vasco Regini","Vladimir Weiss","VÌctor Ibarbo","Walter Gargano","Walter Samuel","Yohan Benalouane","Yuto Nagatomo","Zeljko Brkic","Zlatan Ibrahimovic","…der Citadin Martins");

		// MLS
		List<Integer> players = Arrays.asList(306391,105997,176850,125695,59479,260858,30396,36764,64669,54584,4843,39468,4171,183111,82502,76213,35378,189772,145501,148690,42967,253616,67651,206799,88104,39886,25691,145838,3228,119878,5354,698,164559,39415,45155,59497,12804,146818,33118,178768,77714,58109,39400,50635,20585,39842,59460,105974,9090,71107,125697,174724,39265,15829,256866,26841,70858,35840,307887,230063,180103,105993,39293,145502,105999,26859,39856,27577,39435,178771,147418,209845,141216,59507,45318,25689,30599,39833,39891,37219,39391,206793,108746,37621,26824,39479,255916,77360,77163,189902,81533,3598,40117,157907,15544,39503,38214,38773,50971,26825,53887,71100,37001,245315,170016,282199,131096,59528,75081,79654,45612,85012,77282,8518,73852,181934,105985,176986,111893,31383,39295,108353,37558,254230,77175,41045,37432,62275,19430,178226,51478,223977,43346,26837,131186,60996,13580,40925,43851,73680,51620,174715,39900,90569,12380,131192,28153,30886,84510,174716,24902,30604,99856,3875,77839,73698,179319,168713,6109,222594,128552,260807,39354,59531,137148,32414,163492,172023,20460,225462,79918,39277,145116,183118,25064,4750,77653,99852,174725,32591,26995,114979,68,72613,38222,12131,157009,111930,131177,213001,4075,101399,66322,116884,48198,222565,4170,4140,153896,75422,77131,39393,77767,105975,245893,39899,5860,147496,50987,22813,30593,17029,59465,105988,20797,30602,103246,30686,158095,26961,39493,39469,52580,212979,307890,59590,39434,14060,5794,59519,99690,166628,62241,62810,3451,76728,26277,70135,39484,29579,81119,105973,178781,2904,27617,213017,82571,62115,39840,27167,3144,26411,12707,99859,71096,36454,103627,66443,213051,58367,228117,73114,126630,174729,39892,229912,80670,125701,57488,182164,307728,145114,3462,38928,29023,3207,55748,82718,13556,119722,38264,54927,212977,39895,528,105976,39478,39302,35349,97241,213005,211587,59499,199559,173486,38215,113368,141220,105995);
		List<String> playersId = Arrays.asList("p177983","p60214","p95235","p78019","p50132","p152253","p51770","p48630","p62096","p55819","p27676","p41667","p4133","p113513","p108216","p54106","p28403","p153264","p82460","p106194","p20219","p151940","p49839","p110633","p55409","p41557","p41503","p82533","p1629","p76620","p10411","p13593","p95630","p36431","p45959","p41466","p16721","p83061","p20525","p94295","p82834","p34147","p41526","p41670","p18856","p15338","p41487","p60151","p6448","p50067","p78022","p95321","p41469","p15475","p155016","p33808","p50102","p11390","p131840","p132122","p95253","p60152","p28094","p83378","p51133","p41606","p41647","p20226","p20228","p94381","p83072","p109699","p82844","p41653","p49541","p41600","p50220","p50065","p60520","p15578","p41488","p110608","p50143","p51404","p15560","p41626","p151119","p60536","p96622","p151954","p105840","p3759","p41633","p88812","p17762","p41627","p15046","p15540","p43015","p15285","p60031","p50069","p41540","p164480","p101772","p168301","p95316","p47071","p132000","p95186","p47681","p56812","p111979","p15771","p57252","p95657","p60155","p92438","p105021","p20327","p41476","p60210","p28608","p149359","p111149","p37846","p28090","p66583","p41565","p94934","p33499","p116632","p52583","p41532","p82464","p88236","p41605","p33459","p28665","p20238","p115752","p95228","p41553","p50137","p16882","p131833","p41707","p47407","p96621","p95442","p41551","p41577","p60222","p7958","p35268","p60242","p95278","p95611","p15600","p163358","p77850","p153647","p41599","p45092","p82519","p56790","p94479","p95267","p26815","p89592","p111333","p15281","p83065","p110619","p19785","p4452","p50413","p60213","p95275","p71801","p15517","p68571","p5075","p106519","p75046","p15891","p112999","p37258","p83073","p110624","p15428","p153453","p76479","p92430","p71852","p114579","p7380","p5700","p118721","p61774","p112099","p41564","p77523","p60207","p163793","p15589","p7166","p86035","p41587","p18520","p37368","p53136","p41528","p60139","p53692","p41568","p110945","p33164","p95279","p42893","p41668","p41491","p44836","p110580","p132113","p41610","p15310","p14668","p14934","p41604","p60218","p102456","p55209","p60244","p39228","p76728","p34336","p50056","p41590","p11937","p67250","p60225","p101369","p6685","p15608","p110974","p56613","p73432","p33823","p41666","p1710","p18662","p3227","p60153","p50105","p34361","p92437","p56687","p110609","p68616","p151955","p50122","p78013","p95259","p15764","p118230","p50081","p78016","p48759","p95258","p129430","p82845","p7545","p50075","p17742","p1619","p43604","p83409","p3273","p86938","p41573","p50136","p110572","p33015","p5275","p60795","p15585","p41537","p34291","p59278","p110575","p121332","p41558","p148995","p95272","p39276","p106522","p82846","p60524");
		List<String> playersNames = Arrays.asList("A.J. Cochran","A.J. DeLaGarza","A.J. Soares","Aaron Maund","Abdoulie Mansally","Adam Jahn","Adam Johansson","Adam Moffat","Agustin Viana","AgustÌn Pelletieri","Alain Rochat","Alan Gordon","Alessandro Nesta","Alex Caskey","Alexandre Monteiro De Lima","Alvaro Fernandez","Alvaro Saborio","Alvas Powell","Amobi Okugo","Andres Escobar Diaz","Andrew Driver","Andrew Farrell","Andrew Jacobson","Andrew Wenger","AndrÈs Romero","Andy Dorman","Andy Gruenebaum","Andy Najar","Andy O'Brien","Antonio RodrÌguez Dovale","AntÙnio Augusto Ribeiro Reis Junior","Arne Friedrich","Ashtone Morgan","Atiba Harris","AurÈlien Collin","Bakary SoumarÈ","Barry Robson","Ben Zemanski","Benny Feilhaber","Bernardo Anor","Bill Hamid","Blas PÈrez","Bobby Boswell","Bobby Burling","Bobby Convey","Brad Davis","Brad Evans","Brandon Barklage","Branko Boskovic","Brek Shea","Brian Ownby","C.J. Sapong","Calen Carr","Carlos Bocanegra","Carlos Salcedo","Chad Marshall","Chance Myers","Chris Birchall","Chris Duvall","Chris Klute","Chris Korb","Chris Pontius","Chris Rolfe","Chris Schuler","Chris Tierney","Chris Wingert","Chris Wondolowski","Clint Dempsey","Clyde Simms","Cole Grossman","Collen Warner","Connor Lade","Corben Bone","Corey Ashe","Cristi·n Maidana","Dan Gargan","Dan Kennedy","Dan Paladini","Daniel Hernandez","Danny Califf","Danny O'Rourke","Darren Mattocks","David Horst","David Junior Lopes","Davy Arnaud","Dax McCarty","DeAndre Yedlin","Dejan Jakovic","Diego Chara","Dillon Serna","Dimitry Imbongo Boele","Djimi Traore","Dominic Oduro","Doneil Henry","Donovan Ricketts","Drew Moor","Dwayne De Rosario","Eddie Johnson","Edgar MejÌa","Edson Buddle","Emiliano Dudar","Eric Avila","Eric Kronberg","Eric Miller","Erick Torres","Erik Palmer-Brown","Fabian Castillo","Fabian Espindola","Fabio Alves Macedo","Fanendo Adi","Federico HiguaÌn","Felipe Martins Campanholi","Fernando Cardenas","Freddy Adu","Fredy Montero","Gabriel Farfan","George John","Gershon Koffie","Giancarlo Gonzalez","Gonzalo Pineda","Gonzalo Segares","Graham Zusi","Guillermo Franco","Gyasi Zardes","Hanyer Mosquera","Hassoun Camara","Heath Pearce","Hendry Thomas","Hunter Freeman","HÈctor JimÈnez","Ibrahim Sekagya","Igor de Carvalho Juli„o","Issey Nakajima-Farran","Jack Jewsbury","Jack McInerney","Jackson Goncalves","Jacob Peterson","Jaime Castrillon","Jaime Penedo","Jair Benitez","Jairo Arrieta","Jalil Anibaba","James Riley","Jamison Olave","Jan Gunnar Solli","Jared Watts","Jason Hernandez","Javier Morales","Je-Vaughn Watson","Jeb Brovsky","Jeff Larentowicz","Jeff Parke","Jeremy Hall","Jermain Defoe","Jermaine Taylor","Jhon Kennedy Hurtado","Joao Plata","Joe Bendik","Joe Cannon","Joe Nasco","Johnny Leveron","Jonathan Osorio","Jordan Harvey","Jorge VillafaÒa","Jose Leonardo Ribeiro da Silva","Josh Saunders","Josh Williams","Josue Soto","JosÈ GonÁalves","JosÈ MarÌa MartÌn-Bejarano Serrano","Jun Marques Davidson","Justin Mapp","Justin Morrow","Kelyn Rowe","Kenny Cooper","Kenny Miller","Keon Daniel","Kevin Alston","Kofi Sarkodie","Krzysztof Krol","Kyle Beckerman","Lamar Neagle","Landon Donovan","Lawrence Olum","Leonardo Gonzalez","Lloyd Sam","Logan Emory","Lovel Palmer","Luis Gil","Luis Silva","Luke Moore","Luke Mulholland","Maicon dos Santos Correa","Mamadou Danso","Marcelo Sarvas","Marco Delgado","Marco Di Vaio","Marcus Hahnemann","Mark Bloom","Markus Holgersson","Martin Rivero","Marvell Wynne","Marvin Chavez","Matt Besler","Matt Miazga","Matt Reis","Matteo Ferrari","MatÌas Laba","Maurice Edu","Mauro Rosales","Michael Bradley","Michael Gspurning","Michael Harrington","Michael Lahoud","Michel Garbini Pereira","Mike Magee","Miller BolaÒos","Milovan Mirosevic","Moises Hernandez","Nat Borchers","Nathan Sturgis","Ned Grabavoy","Nelson Rivas","Nick DeLeon","Nick Hagglund","Nick LaBrocca","Nick Rimando","Nigel Reo-Coker","Obafemi Martins","Omar Cummings","Omar Gonz·lez","Oriol Rosell Argerich","Oscar Boniek GarcÌa","Osvaldo Alonso","Pa-Modou Kah","Pablo Pintos","Patrice Bernier","Patrick Nyarko","Paulo Nagamura","Pavel Pardo","Peterson Joseph","Quincy Amarikwa","Rafael Baca","Rafael M·rquez","Ramiro Corrales","Raymon Gaddis","Ra˙l Fern·ndez","Reggie Lambe","Ricardo Clark","Robbie Findley","Robbie Keane","Robbie Russell","Robert Earnshaw","Rodney Wallace","Roger Espinoza","Roy Miller","Russell Teibert","Ryan Guy","Ryan Meara","Saer Sene","Scott Caldwell","Sean Franklin","Sean Johnson","Servando Carrasco","Shalrie Joseph","Shane O'Neill","Shea Salinas","Sheanon Williams","Simon Dawkins","Stephen McCarthy","Steve Birnbaum","Steven Beitashour","Steven Caldwell","Steven Lenhart","Steven Smith","Thierry Henry","Thomas Piermayr","Tilson Oswaldo Minda","Tim Cahill","Tim Melia","Todd Dunivant","Tony Beltran","Tony Cascio","Tony Lochhead","Torsten Frings","Tristan Bowen","Tyrone Marshall","Tyson Wahl","Victor Bernardez","Victor P·lsson","Warren Creavalle","Waylon Francis","Wells Thompson","Wil Trapp","Will Bruin","Will Johnson","Yordany Alvarez","Zach Loyd","Zach Scott");

//		// EL
//		List<Integer> players = Arrays.asList(51118,73460,51152,50337,48486,50307,79977,34763,100009,7624,14031,52470,59564,52918,41786,86057,111994,98428,144143,34951,35855,57402,36896,43458,55854,46662,29056,47146,5896,44779,44624,34226,87211,31886,43299,13905,,59938,45599,46504,5509,130824,52595,82389,2934,35548,51174,47571,62180,19999,96740,55211,5793,19998,49239,63212,37592,39784,24654,259943,25758,43250,80941,88721,82105,53477,71905,77249,15717,83910,10885,17885,88102,4489,9852,148967,104752,69006,34372,52960,110309,155553,6832,102192,56036,83895,6242,74935,38593,34542,41759,94523,3273,5635,42714,117686,65331,48890,6119,19368,68203,44698,93081,55099,5017,36371,19286,131709,62359,51711,55837,142136,32912,4772,70625,65518,49485,37080,29456,13168,106041,129722,27300,15872,70767,43378,200512,19182,36293,25035,81649,5486,34026,8480,4698,84909,129806,33046,6294,8538,16816,5944,35259,62920,38041,22560,76092,60573,69004,43991);
//		List<String> playersId = Arrays.asList("p41795","p51565","p128389","p67512","p46165","p57184","p67470","p43797","p61018","p11878","p1195","p60399","p63550","p52498","p39024","p84236","p56650","p69013","p84724","p47324","p18804","p44460","p20491","p38438","p50937","p60561","p4456","p56834","p7459","p18507","p39472","p40643","p48610","p19812","p48297","p20642","p104626","p49272","p40615","p47453","p11281","p101160","p43573","p61678","p6330","p20599","p52538","p57186","p40486","p18605","p60716","p56554","p14754","p18352","p62378","p37162","p84819","p39062","p51469","p164556","p33203","p39194","p71778","p77453","p60914","p55844","p55268","p67420","p15153","p68286","p41175","p34641","p64252","p12433","p14503","p93001","p66806","p56345","p37880","p53150","p61615","p105504","p7236","p78272","p104276","p118749","p7418","p68947","p19802","p28340","p52956","p91925","p1640","p14105","p55010","p71579","p58876","p81405","p16884","p39104","p54528","p59987","p59836","p85515","p50448","p50401","p47038","p116120","p83071","p9534","p84901","p103482","p27648","p41990","p69071","p66203","p81153","p52283","p15447","p19921","p69776","p74361","p39294","p50941","p56375","p47457","p110979","p18401","p37857","p48348","p95625","p9954","p28108","p53232","p15730","p50721","p74419","p43570","p26789","p15269","p40947","p11192","p21019","p51948","p51539","p20577","p61289","p49396","p75922","p41370");
//		List<String> playersNames = Arrays.asList("Adil Rami","Alan Douglas Borges de Carvalho","Aleksandar Mitrovic","Aleksandar Rajcevic","Aleksandr Prudnikov","Ales Mejac","Ales Mertelj","Alexander Gr¸nwald","Alexandre Luiz Reame","Ander Murillo","Andrew Johnson","Andrey Ivanov","Andrey Poryvaev","AndrÈ Goncalves Dias","AndrÈ Le„o","AntÛnio Eduardo Pereira dos Santos","Avihay Yadin","Bal·zs Megyeri","Bartosz Bereszynski","Bruno Miguel Moreira Sousa","Cameron Jerome","Charles KaborÈ","Chris McCann","ClÈment ChantÙme","Cristian Ansaldi","Cristian Tanase","CÈsar Navas","Dan Alexa","David Pizarro","Diego Da Silva Costa","DieudonnÈ Mbokani","Djamel Abdoun","Dmitry Baga","Dusan Kuciak","Edmar Aparecida Holovskyi","Edwin Ouon","Eiad Khotaba","Elderson Uwa EchiÈjilÈ","Emiliano Ins˙a","Eric Bicfalvi","Eric Djemba-Djemba","Evgeniy Zubeyko","Fabian Frei","Fallou Diagne","Ferdinand Feldhofer","Fernando Amorebieta","Fernando Francisco Reges","Florin Costea","Gal Shish","GastÛn Sangoy","GastÛn Sauro","Gervasio N˙Òez","Giovanni Pasquale","Gonzalo RodrÌguez","Guido Burgstaller","Gyorgy Sandor","Harald Pichler","HÈlder Jorge Leal Rodrigues Barbosa","Ilya Maksimov","Isaac Sackey","Jaba Kankava","Jan Vertonghen","Janusz Gol","Jeffrey Bruma","Joel Matip","Jonathan Cristaldo","Jorge And˙jar Moreno","Jovan Vidovic","Juan Alberto Andreu Alvarado","Kalilou TraorÈ","Karim GuÈdÈ","Karim Haggui","Karlen Mkrtchyan","Khalid Boulahrouz","Konstantinos Katsouranis","Konstantinos Stafylidis","Kostas Manolas","Lacina TraorÈ","Landry N'GuÈmo","Leandro Almeida da Silva","Lucas Orban","Luciano Lima da Silva","Luciano Zauri","Luis Pedro Cavanda","LuÌs Neto","Marcelo Diaz","Marco Caneira","Marek Bakos","Marek Hamsik","Marek Suchy","Mario Budimir","Martin Milec","Matthew Upson","Matthieu ChalmÈ","Mehdi Carcela-Gonz·lez","Michal Czekaj","Miguel Alfonso Herrero Javaloyas","Mihai Pintilii","Mohamed Sissoko","Mousa DembÈlÈ","Moussa Maazou","M·rio Jorge Malino Paulino","Nick Viergever","Nicolas Hˆfler","Niklas Moisander","Nikola Kalinic","Nikos Spyropoulos","Ogenyi Onazi","Osman Chavez","Pablo Brand·n","Pedro Correia","Pedro Juli„o Azevedo Junior","Peter Larsson","Philippe Montandon","Premysl Kovar","Raphael Koch","Rasim Tagirbekov","Rasmus Bengtsson","Rasmus Lindgren","Raul Meireles","Ricardo Cavalcante Mendes","Roei Gordana","Rolando Da Fonseca","Roman Sharonov","Roman Zozulya","Romeo Surdu","Sadio ManÈ","Salvatore Aronica","Serge Gakpe","Sergei Ryzhikov","Serhiy Rybalka","Seydou Keita","Siaka TiÈnÈ","Sito Riera","Stijn Schaars","Svetoslav Dyakov","Tal Ben Haim","Tavares Varela Adilson Cabral","Thomas Burgstaller","Tiago Cardoso Mendes","Tolga Zengin","Traianos Dellas","Valentin Ivanov Iliev","VÌctor Ruiz","Walid Atta","Wesley Lopes da Silva","Willians Domingos Fernandes","Yann M'Vila","Yevhen Khacheridi","Yoav David Ziv");
//		
//		// CL
//		List<Integer> players = Arrays.asList(51118,69518,69683,5957,32522,35047,2514,2889,104597,13121,66934,117551,37647,161869,25732,55255,39073,25812,119296,86930,38473,29260,14329,54659,122043,38305,9799,26485,3160,108354,44057,111195,65072,37941,3730,33706,44501,102558,38970,39679,2963,27306,74232,7451,46175,19726,41281,129788,20007,36688,19446,5477,26,39475,12688,65230,25557,75287,12518,23951,33866,57834,15647,44058,89222,3455,28260);
//		List<String> playersId = Arrays.asList("p41795","p62211","p51437","p18372","p20399","p41189","p15208","p14477","p76623","p27256","p55037","p63623","p37901","p102747","p37203","p76267","p40561","p20301","p112338","p56663","p37848","p18102","p39473","p50656","p102578","p21006","p13169","p40691","p1718","p80146","p37507","p111478","p55575","p42738","p14985","p38530","p39563","p61170","p16020","p41184","p15312","p27334","p78100","p8758","p72603","p14965","p37788","p74438","p20658","p51855","p18229","p13356","p5139","p41703","p16223","p54104","p17861","p52117","p27251","p44413","p39847","p32284","p18051","p59936","p76349","p9808","p18759");
//		List<String> playersNames = Arrays.asList("Adil Rami","Adrian Salageanu","Alan Dzagoev","Alberto Aquilani","Antonio Barrag·n","Axel Witsel","Bastian Schweinsteiger","Benjamin Huggel","Bram Nuytinck","Bruno Eduardo Regufe Alves","Cheikhou KouyatÈ","Denis Polyakov","Dimitri Payet","Djibril Sidibe","Dmytro Chygrynskiy","Douglas Ferreira","Emerson da Conceicao","Emir Spahic","Emre Can","Fabrice N'Sakala","Garry Bocaly","Giorgio Chiellini","Gustavo Manduca","Holger Badstuber","HÈctor Herrera","Ivan Ivanov","Jerko Leko","Jerome Boateng","John Terry","Jordan Ayew","Jorge Fucile","JoÎl Veltman","Juan Insaurralde","Juan ZuÒiga","Kim K‰llstrˆm","LuÌs Almeida da Cunha","Marcelo Vieira Da Silva Junior","Marco Verratti","Marian Cisovsky","Marouane Fellaini","MartÌn Demichelis","Mathieu Debuchy","MatÌas Aguirregaray","Mikel Arteta","Milan Perendija","Nemanja Vidic","Nicol·s Pareja","Nir Biton","Pablo Zabaleta","Pontus Wernbloom","Riccardo Montolivo","Rod Fanni","Roman Weidenfeller","Sacha Kljestan","Scott Brown","Sergio Busquets","Sergio Ramos","Seydou Doumbia","Silvio Proto","Steve Mandanda","Steven Defour","Victorio Maximiliano Pereira P·ez","Vladimir Bystrov","Wojciech Szczesny","Yaroslav Rakitskiy","Zlatan Ibrahimovic","¡lvaro Arbeloa");
		
		
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
			String fileFolder = "/Users/katiamaeda/git/SoccerBot/SoccerBot/output";

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
				String inputFile2 = fileFolder+"/Market Value-MLS.xlsx";
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
