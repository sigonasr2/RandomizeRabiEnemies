package sig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import sig.utils.FileUtils;

public class ReadFile {
	
	final static int HPMOD = 15; //15% normal HP.
	final static int DMGMOD = 35;  //35% normal damage.
	static HashMap<Integer,List<Integer>> VALID_EVENTS = new HashMap<Integer,List<Integer>>();
	final static Integer RIGHT = 195;
	final static Integer LEFT = 196;
	final static Integer UP = 198;
	final static Integer DOWN = 199;
	final static Integer DIRECTION_MODIFIERS = -9999;
	final static Integer DIRECTION_HORZ_MODIFIERS = -9998;
	
	public static void main(String[] args) {
		
		
		VALID_EVENTS.put(1003,null);
		VALID_EVENTS.put(1004,null);
		VALID_EVENTS.put(1005,Arrays.asList(UP,DOWN));
		VALID_EVENTS.put(1006,Arrays.asList(UP,DOWN));
		VALID_EVENTS.put(1007,Arrays.asList(UP,DOWN,LEFT,RIGHT));
		VALID_EVENTS.put(1008,Arrays.asList(RIGHT));
		VALID_EVENTS.put(1009,null);
		VALID_EVENTS.put(1010,null);
		VALID_EVENTS.put(1011,null);
		VALID_EVENTS.put(1012,null);
		VALID_EVENTS.put(1013,null);
		VALID_EVENTS.put(1014,null);
		VALID_EVENTS.put(1015,null);
		VALID_EVENTS.put(1016,null);
		VALID_EVENTS.put(1017,Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12));
		VALID_EVENTS.put(1018,null);
		VALID_EVENTS.put(1019,Arrays.asList(UP,DOWN,LEFT,RIGHT));
		VALID_EVENTS.put(1020,null);
		VALID_EVENTS.put(1021,null);
		VALID_EVENTS.put(1022,Arrays.asList(0,5));
		VALID_EVENTS.put(1023,null);
		VALID_EVENTS.put(1024,null);
		VALID_EVENTS.put(1025,null);
		VALID_EVENTS.put(1027,null);
		VALID_EVENTS.put(1028,null);
		VALID_EVENTS.put(1030,null);
		VALID_EVENTS.put(1031,null);
		VALID_EVENTS.put(1032,Arrays.asList(0,1));
		VALID_EVENTS.put(1033,Arrays.asList(0,1));
		VALID_EVENTS.put(1035,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1036,Arrays.asList(1,2,3));
		VALID_EVENTS.put(1037,null);
		VALID_EVENTS.put(1038,null);
		VALID_EVENTS.put(1039,null);
		VALID_EVENTS.put(1043,null);
		VALID_EVENTS.put(1045,Arrays.asList(0,5));
		VALID_EVENTS.put(1046,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1053,null);
		VALID_EVENTS.put(1054,null);
		VALID_EVENTS.put(1055,Arrays.asList(0,3));
		VALID_EVENTS.put(1056,Arrays.asList(1,0));
		VALID_EVENTS.put(1096,Arrays.asList(0,2,5,6,7));
		VALID_EVENTS.put(1097,Arrays.asList(0,1,2,5,6,7));
		VALID_EVENTS.put(1098,null);
		VALID_EVENTS.put(1099,null);
		VALID_EVENTS.put(1102,null);
		VALID_EVENTS.put(1100,Arrays.asList(0,1));
		VALID_EVENTS.put(1101,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1103,null);
		VALID_EVENTS.put(1105,Arrays.asList(0,2,5,6,7));
		VALID_EVENTS.put(1104,null);
		VALID_EVENTS.put(1106,Arrays.asList(0,1));
		VALID_EVENTS.put(1107,null);
		VALID_EVENTS.put(1108,Arrays.asList(0,1));
		VALID_EVENTS.put(1109,Arrays.asList(0,1));
		VALID_EVENTS.put(1110,null);
		VALID_EVENTS.put(1111,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1112,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1113,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1114,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1115,null);
		VALID_EVENTS.put(1116,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1117,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1118,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1119,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1120,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1124,null);
		VALID_EVENTS.put(1125,Arrays.asList(0,1,2,3,4,5,DIRECTION_MODIFIERS));
		VALID_EVENTS.put(1126,Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
		VALID_EVENTS.put(1127,Arrays.asList(0,1)); //Arrays.asList(0,1)
		VALID_EVENTS.put(1128,null);
		VALID_EVENTS.put(1129,Arrays.asList(0,1,2));
		VALID_EVENTS.put(1130,Arrays.asList(0,1,2,3,4,5,6));
		VALID_EVENTS.put(1131,null);
		VALID_EVENTS.put(1132,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1133,Arrays.asList(0,1,5));
		VALID_EVENTS.put(1134,null);
		VALID_EVENTS.put(1135,Arrays.asList(0,1));
		VALID_EVENTS.put(1136,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1137,Arrays.asList(0,1,DIRECTION_HORZ_MODIFIERS));
		VALID_EVENTS.put(1138,Arrays.asList(0,2));
		VALID_EVENTS.put(1139,Arrays.asList(0,1,2,3));
		VALID_EVENTS.put(1140,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1141,null);
		VALID_EVENTS.put(1142,null);
		VALID_EVENTS.put(1143,null);
		VALID_EVENTS.put(1144,Arrays.asList(0,1,2));
		VALID_EVENTS.put(1145,Arrays.asList(0,1,2));
		VALID_EVENTS.put(1146,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1147,Arrays.asList(0,1));
		VALID_EVENTS.put(1148,Arrays.asList(0,1));
		VALID_EVENTS.put(1149,Arrays.asList(0,1,2));
		VALID_EVENTS.put(1150,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1151,null);
		VALID_EVENTS.put(1152,Arrays.asList(0,1));
		VALID_EVENTS.put(1153,null);
		VALID_EVENTS.put(1154,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1155,null);
		VALID_EVENTS.put(1156,Arrays.asList(0,1,5,6));
		VALID_EVENTS.put(1157,null);
		VALID_EVENTS.put(1158,Arrays.asList(0,5,6));
		VALID_EVENTS.put(1159,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1160,Arrays.asList(0,1,2,3,4));
		VALID_EVENTS.put(1161,null);
		VALID_EVENTS.put(1162,null);
		VALID_EVENTS.put(1163,Arrays.asList(0,1,3,4,5,6,7));
		VALID_EVENTS.put(1164,Arrays.asList(0,1,2,3,4,5));
		VALID_EVENTS.put(1174,Arrays.asList(UP,DOWN,LEFT,RIGHT));
		VALID_EVENTS.put(1001,null);
		VALID_EVENTS.put(1002,null);
		VALID_EVENTS.put(1047,null);
		VALID_EVENTS.put(1048,null);
		VALID_EVENTS.put(1165,null);
		VALID_EVENTS.put(1166,null);
		
		try {
			for (int l=0;l<args.length;l++) {
				JSONObject data = FileUtils.readJsonFromFile(args[l]);
				JSONArray layers = data.getJSONArray("layers");
				for (int i=0;i<layers.length();i++) {
					//System.out.println(layers);
					if (layers.getJSONObject(i).getString("name").equalsIgnoreCase("event")) {
						JSONArray objects = layers.getJSONObject(i).getJSONArray("objects");
						if (args[l].contains("area0.json")) {
							System.out.println("Adding helper modifications to this file.");
							AddHelperTiles(objects);
						}
						for (int j=0;j<objects.length();j++) {
							JSONObject tile = objects.getJSONObject(j);
							Integer id = Integer.parseInt(tile.getString("name"));
							if (VALID_EVENTS.containsKey(id) && id!=1017 /*Do not modify springs!!*/ 
									&& (id!=1039 || !args[l].contains("area5.json")) /*Do not modify shopkeeper!*/ 
									&& (id!=1120 || !args[l].contains("area1.json")) /*Keep bomb girls in pyramid.*/
									&& (id!=1120 || !args[l].contains("area1.json")) /*Keep bomb girls in pyramid.*/
									&& (id!=1120 || !args[l].contains("area0.json")) /*Keep bomb girls in cocoa cave.*/
									&& (id!=1120 || !args[l].contains("area7.json")) /*Keep bomb girls in volcanic canerns.*/
									&& (id!=1016 || !args[l].contains("area0.json")) /*Keep computer cicini.*/
									&& (id!=1156 || !args[l].contains("area6.json")) /*Keep bomb bones.*/
									) {
								//Swap it out for another one.
								Integer tilex = tile.getInt("x");
								Integer tiley = tile.getInt("y");
								//See if there is an adjacent modifier tile. Remove it.
								JSONObject adjtile = null;
								boolean topIsFree = true;
								boolean rightIsFree = true;
								boolean stopAdjacentTileSearch = false;
								for (int k=0;k<objects.length();k++) {
									adjtile = objects.getJSONObject(k);
									if (adjtile.has("x")) {
										Integer adjtilex = adjtile.getInt("x");
										Integer adjtiley = adjtile.getInt("y");
										Integer adjid = Integer.parseInt(tile.getString("name"));
										if (!stopAdjacentTileSearch) {
											if ((Math.abs(adjtilex-tilex)==32 || Math.abs(adjtiley-tiley)==32) &&
													adjid>=5000) {
												//Found a valid adjacent tile. Track it.
												stopAdjacentTileSearch = true;
											}
										}
										if (adjtilex-tilex==32) {
											rightIsFree=false;
										}
										if (tiley-adjtiley==32) {
											topIsFree=false;
										}
										if (!rightIsFree && !topIsFree && stopAdjacentTileSearch) {
											break;
										}
									} else {
										System.out.println(adjtile);
									}
								}
								Integer[] values = new Integer[VALID_EVENTS.keySet().size()];
								values = VALID_EVENTS.keySet().toArray(values);
								//Pick a random value.
								int slot = (int)(Math.random()*values.length);
								tile.put("name", values[slot]);
								if (VALID_EVENTS.get(values[slot])!=null) {
									//see if there's an adjacent tile already and change that one to a random value. Otherwise make a new one.
									if (adjtile==null) {
										JSONObject obj = new JSONObject();
										if (topIsFree) {
											obj.put("y", tiley-32);
											obj.put("x", tilex);
											topIsFree=false;
										} else 
										if (rightIsFree){
											obj.put("y", tiley);
											obj.put("x", tilex+32);
											rightIsFree=false;
										}
										obj.put("width", 32);
										obj.put("height", 32);
										int tileID = SelectRandomModifier(VALID_EVENTS.get(values[slot]),objects,tilex,tiley,topIsFree,rightIsFree);
										obj.put("name",Integer.toString(tileID));
										if (tileID!=-1) {
											objects.put(obj);
										}
									} else {
										int tileID = SelectRandomModifier(VALID_EVENTS.get(values[slot]),objects,tilex,tiley,topIsFree,rightIsFree);
										if (tileID!=-1) {
											adjtile.put("name", Integer.toString(tileID));
										}
									}
								}
							}
						}
						AddRandomBossTile(objects,13088,4480,1,args[l]); //Pandora
						AddRandomBossTile(objects,7520,3776,3,args[l]); //Rita
						AddRandomBossTile(objects,6560,2784,4,args[l]); //Ashuri 2
						AddRandomBossTile(objects,14912,1248,4,args[l]); //Saya
						AddRandomBossTile(objects,3200,6016,2,args[l]); //Kotri 1
						AddRandomBossTile(objects,9472,2432,1,args[l]); //Kotri 2
						AddRandomBossTile(objects,14400,5312,0,args[l]); //Cicini
						AddRandomBossTile(objects,9888,2432,9,args[l]); //Syaro
						AddRandomBossTile(objects,10496,5312,2,args[l]); //Chocolate
						AddRandomBossTile(objects,9216,1696,2,args[l]); //Vanilla
						AddRandomBossTile(objects,7712,2432,3,args[l]); //Nixie
						AddRandomBossTile(objects,1632,1344,3,args[l]); //Nieve
						AddRandomBossTile(objects,3520,1696,0,args[l]); //Aruraune
						AddRandomBossTile(objects,14944,992,0,args[l]); //Lilith
						AddRandomBossTile(objects,7296,5824,3,args[l]); //Seana
						AddRandomBossTile(objects,8608,1664,6,args[l]); //Keke Bunny
						AddRandomBossTile(objects,5152,2784,8,args[l]); //Illusion Alius I
						AddRandomBossTile(objects,6144,2784,8,args[l]); //Illusion Alius II
						AddRandomBossTile(objects,8800,2784,8,args[l]); //Illusion Alius III
						AddRandomBossTile(objects,10560,6016,1,args[l]); //Shadow Pandora
						AddRandomBossTile(objects,9408,1696,3,args[l]); //Shadow Rita
					}
				}
				String[] json = new String[] {data.toString()};
				FileUtils.writetoFile(json, args[l]);
			}
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void AddTile(JSONArray objects,int x,int y,int event,int area,String currentArea) {
		if (currentArea.contains("area"+area+".json")) {
			JSONObject obj = new JSONObject();
			obj.put("x", x);
			obj.put("y", y);
			obj.put("name", Integer.toString(event)); //ENEMY HP MOD
			obj.put("width", 32);
			obj.put("height", 32);
			objects.put(obj);	
		}
	}
	private static void AddRandomBossTile(JSONArray objects,int x,int y,int area,String currentArea) {
		if (currentArea.contains("area"+area+".json")) {
			int[] events = {1009,1010,1011,1012,1013,1014,1015,1016,1017,1018,1020,1021,1022,1023,1024,1025,1030,1031,1032,1033,1035,1036,1037,1038,1039,1043,1045,1046,1053,1054,1056};
			
	
			int chance=1;
			int count=0;
			while (true) {
				if (Math.random()*chance<=1) {
						JSONObject obj = new JSONObject();
						obj.put("x", x);
						obj.put("y", y-count*32);
						obj.put("name", Integer.toString(events[(int)(Math.random()*events.length)])); //ENEMY HP MOD
						obj.put("width", 32);
						obj.put("height", 32);
						objects.put(obj);	
				} else {
					break;
				}
				chance*=5;
				count++;
			}
		}
	}

	private static void AddHelperTiles(JSONArray objects) {
		//Trust me, you want these...
		for (int i=0;i<12;i++) {
			JSONObject obj = new JSONObject();
			obj.put("x", 4064);
			obj.put("y", 3168-i*32);
			obj.put("name", "571"); //ENEMY HP MOD
			obj.put("width", 32);
			obj.put("height", 32);
			objects.put(obj);
			obj = new JSONObject();
			obj.put("x", 4096);
			obj.put("y", 3168-i*32);
			obj.put("name", Integer.toString(HPMOD));
			obj.put("width", 32);
			obj.put("height", 32);
			objects.put(obj);
			obj = new JSONObject();
			obj.put("x", 4160);
			obj.put("y", 3168-i*32);
			obj.put("name", "572"); //ENEMY DMG MOD
			obj.put("width", 32);
			obj.put("height", 32);
			objects.put(obj);
			obj = new JSONObject();
			obj.put("x", 4192);
			obj.put("y", 3168-i*32);
			obj.put("name", Integer.toString(DMGMOD));
			obj.put("width", 32);
			obj.put("height", 32);
			objects.put(obj);
		}
	}

	private static int SelectRandomModifier(List<Integer> list,JSONArray objects,int tilex,int tiley,boolean top, boolean right) {
		List<Integer> finalList = new ArrayList<Integer>();
		if (list!=null) {
			if (list.contains(DIRECTION_MODIFIERS) || list.contains(DIRECTION_HORZ_MODIFIERS)) {
				Integer[] randDir = null;
				if (list.contains(DIRECTION_MODIFIERS)) {
					randDir = new Integer[] {RIGHT,LEFT,UP,DOWN};
				} else {
					randDir = new Integer[] {RIGHT,LEFT};
				}
				for (int i=0;i<list.size();i++) {
					if (list.get(i)!=DIRECTION_MODIFIERS &&
							list.get(i)!=DIRECTION_HORZ_MODIFIERS) {
						finalList.add(list.get(i));
					}
				}
				JSONObject obj = new JSONObject();
				obj.put("width", 32);
				obj.put("height", 32);
				if (top) {
					obj.put("y", tiley-32);
					obj.put("x", tilex);
				} else 
				if (right){
					obj.put("y", tiley);
					obj.put("x", tilex+32);
				}
				
				if (top||right) {
					obj.put("name",Integer.toString(randDir[(int)(Math.random()*randDir.length)]));
					objects.put(obj);
				}
			}
			if (finalList.size()==0) {
				return -1;
			} else 
				return finalList.get((int)(Math.random()*finalList.size()))+5000;
		} else {return -1;}
	}
}
