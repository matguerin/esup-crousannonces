/**
 * Licensed to ESUP-Portail under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * ESUP-Portail licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esupportail.crousannonces.utils.constants;

import java.util.HashMap;
import java.util.Map;

public class Area  {
	
	public static final Map<Integer, Map<Integer, String>> PLACE_CODE = new HashMap<Integer, Map<Integer, String>>();
	
	public static final Map<Integer, String> INSEE_CODE = new HashMap<Integer, String>();
	public static final Map<Integer, String> TOWN_CODE = new HashMap<Integer, String>();
	public static final Map<Integer, String> DEPARTMENT_CODE = Department.getList();
	public static final Map<Integer, String> REGION_CODE = new HashMap<Integer, String>();
	
	static {
		
		Area.PLACE_CODE.put(2, Area.TOWN_CODE);
		Area.PLACE_CODE.put(3, Area.DEPARTMENT_CODE);
		Area.PLACE_CODE.put(4, Area.REGION_CODE);
		
		// Town codes
		Area.TOWN_CODE.put(80, "Nîmes");
		Area.TOWN_CODE.put(77, "Agen");
		Area.TOWN_CODE.put(18, "Aix-en-Provence");
		Area.TOWN_CODE.put(24, "Ajaccio");
		Area.TOWN_CODE.put(90, "Albi");
		Area.TOWN_CODE.put(83, "Alençon");
		Area.TOWN_CODE.put(19, "Amiens");
		Area.TOWN_CODE.put(12, "Angers");
		Area.TOWN_CODE.put(55, "Angoulême");
		Area.TOWN_CODE.put(69, "Annecy");
		Area.TOWN_CODE.put(139, "Antony");
		Area.TOWN_CODE.put(100, "Arras");
		Area.TOWN_CODE.put(86, "Aurillac");
		Area.TOWN_CODE.put(151, "Auxerre");
		Area.TOWN_CODE.put(60, "Avignon");
		Area.TOWN_CODE.put(129, "Bastia");
		Area.TOWN_CODE.put(76, "Bayonne / Anglet (Côte Basque-Adour)");
		Area.TOWN_CODE.put(61, "Beauvais");
		Area.TOWN_CODE.put(70, "Belfort");
		Area.TOWN_CODE.put(20, "Besançon");
		Area.TOWN_CODE.put(111, "Blois");
		Area.TOWN_CODE.put(145, "Bobigny");
		Area.TOWN_CODE.put(74, "Bordeaux");
		Area.TOWN_CODE.put(138, "Boulogne-Billancourt");
		Area.TOWN_CODE.put(102, "Boulogne-sur-Mer");
		Area.TOWN_CODE.put(112, "Bourges");
		Area.TOWN_CODE.put(50, "Brest");
		Area.TOWN_CODE.put(120, "Brive");
		Area.TOWN_CODE.put(142, "Cachan");
		Area.TOWN_CODE.put(22, "Caen");
		Area.TOWN_CODE.put(103, "Calais");
		Area.TOWN_CODE.put(91, "Castres");
		Area.TOWN_CODE.put(66, "Cayenne (Guyanne)");
		Area.TOWN_CODE.put(140, "Cergy-Pontoise");
		Area.TOWN_CODE.put(108, "Châlons-en-Champagne");
		Area.TOWN_CODE.put(65, "Chambéry");
		Area.TOWN_CODE.put(107, "Charleville-Mézières");
		Area.TOWN_CODE.put(113, "Chartres");
		Area.TOWN_CODE.put(114, "Châteauroux");
		Area.TOWN_CODE.put(56, "Châtellerault");
		Area.TOWN_CODE.put(82, "Cherbourg-Octeville");
		Area.TOWN_CODE.put(13, "Cholet");
		Area.TOWN_CODE.put(23, "Clermont-Ferrand");
		Area.TOWN_CODE.put(96, "Colmar");
		Area.TOWN_CODE.put(62, "Compiègne");
		Area.TOWN_CODE.put(130, "Corte");
		Area.TOWN_CODE.put(25, "Créteil");
		Area.TOWN_CODE.put(26, "Dijon");
		Area.TOWN_CODE.put(104, "Douai-Lens");
		Area.TOWN_CODE.put(109, "Dunkerque");
		Area.TOWN_CODE.put(119, "Egletons");
		Area.TOWN_CODE.put(128, "Epinal");
		Area.TOWN_CODE.put(98, "Evreux");
		Area.TOWN_CODE.put(134, "Evry");
		Area.TOWN_CODE.put(123, "Felletin");
		Area.TOWN_CODE.put(59, "Grenoble");
		Area.TOWN_CODE.put(125, "Guéret");
		Area.TOWN_CODE.put(115, "Issoudun");
		Area.TOWN_CODE.put(52, "Kourou (Guyanne)");
		Area.TOWN_CODE.put(11, "La Roche-sur-Yon");
		Area.TOWN_CODE.put(57, "La Rochelle");
		Area.TOWN_CODE.put(124, "La Souterraine");
		Area.TOWN_CODE.put(149, "Lannion");
		Area.TOWN_CODE.put(64, "Laon");
		Area.TOWN_CODE.put(16, "Laval");
		Area.TOWN_CODE.put(122, "Le Creusot");
		Area.TOWN_CODE.put(97, "Le Havre");
		Area.TOWN_CODE.put(14, "Le Mans");
		Area.TOWN_CODE.put(85, "Le Puy-en-Velay");
		Area.TOWN_CODE.put(101, "Le Tampon");
		Area.TOWN_CODE.put(28, "Lille");
		Area.TOWN_CODE.put(29, "Limoges");
		Area.TOWN_CODE.put(126, "Longwy");
		Area.TOWN_CODE.put(48, "Lorient");
		Area.TOWN_CODE.put(31, "Lyon");
		Area.TOWN_CODE.put(133, "Mantes-la-Jolie");
		Area.TOWN_CODE.put(143, "Marne-la-Vallée");
		Area.TOWN_CODE.put(17, "Marseille");
		Area.TOWN_CODE.put(136, "Massy");
		Area.TOWN_CODE.put(110, "Maubeuge");
		Area.TOWN_CODE.put(43, "Metz");
		Area.TOWN_CODE.put(92, "Millau");
		Area.TOWN_CODE.put(72, "Montbéliard");
		Area.TOWN_CODE.put(84, "Montluçon");
		Area.TOWN_CODE.put(40, "Montpellier");
		Area.TOWN_CODE.put(87, "Moulins");
		Area.TOWN_CODE.put(94, "Mulhouse");
		Area.TOWN_CODE.put(42, "Nancy");
		Area.TOWN_CODE.put(137, "Nanterre");
		Area.TOWN_CODE.put(9, "Nantes");
		Area.TOWN_CODE.put(44, "Nice");
		Area.TOWN_CODE.put(58, "Niort");
		Area.TOWN_CODE.put(53, "Orléans");
		Area.TOWN_CODE.put(135, "Orsay");
		Area.TOWN_CODE.put(41, "Paris");
		Area.TOWN_CODE.put(75, "Pau");
		Area.TOWN_CODE.put(78, "Périgueux");
		Area.TOWN_CODE.put(95, "Perpignan");
		Area.TOWN_CODE.put(68, "Pointe-à-Pitre (Guadeloupe)");
		Area.TOWN_CODE.put(39, "Poitiers");
		Area.TOWN_CODE.put(49, "Quimper");
		Area.TOWN_CODE.put(46, "Rambouillet");
		Area.TOWN_CODE.put(37, "Reims");
		Area.TOWN_CODE.put(38, "Rennes");
		Area.TOWN_CODE.put(35, "Rouen");
		Area.TOWN_CODE.put(148, "Saint-Brieuc");
		Area.TOWN_CODE.put(36, "Saint-Denis");
		Area.TOWN_CODE.put(144, "Saint-Denis");
		Area.TOWN_CODE.put(33, "Saint-Etienne");
		Area.TOWN_CODE.put(132, "Saint-Germain-en-Laye");
		Area.TOWN_CODE.put(10, "Saint-Nazaire");
		Area.TOWN_CODE.put(116, "Saint-Omer");
		Area.TOWN_CODE.put(99, "Saint-Pierre");
		Area.TOWN_CODE.put(131, "Saint-Quentin-en-Yvelines");
		Area.TOWN_CODE.put(127, "Sarreguemines");
		Area.TOWN_CODE.put(51, "Schoelcher (Martinique)");
		Area.TOWN_CODE.put(146, "Sénart");
		Area.TOWN_CODE.put(79, "Sophia Antipolis");
		Area.TOWN_CODE.put(47, "Strasbourg");
		Area.TOWN_CODE.put(93, "Tarbes");
		Area.TOWN_CODE.put(45, "Toulon");
		Area.TOWN_CODE.put(32, "Toulouse");
		Area.TOWN_CODE.put(54, "Tours");
		Area.TOWN_CODE.put(106, "Troyes");
		Area.TOWN_CODE.put(121, "Tulle");
		Area.TOWN_CODE.put(63, "Valence");
		Area.TOWN_CODE.put(117, "Valenciennes");
		Area.TOWN_CODE.put(147, "Vannes");
		Area.TOWN_CODE.put(30, "Versailles");
		Area.TOWN_CODE.put(73, "Vesoul");
		Area.TOWN_CODE.put(88, "Vichy");

		// Region Codes
		
		Area.REGION_CODE.put(72, "Aquitaine");
		Area.REGION_CODE.put(83, "Auverge");
		Area.REGION_CODE.put(25, "Basse Normandie");
		Area.REGION_CODE.put(26, "Bourgogne");
		Area.REGION_CODE.put(53, "Bretagne");
		Area.REGION_CODE.put(24, "Centre");
		Area.REGION_CODE.put(21, "Champagne-Ardenne");
		Area.REGION_CODE.put(94, "Corse");
		Area.REGION_CODE.put(43, "Franche-Comté");
		Area.REGION_CODE.put(01, "Guadeloupe");
		Area.REGION_CODE.put(03, "Guyanne");
		Area.REGION_CODE.put(23, "Haute Normandie");
		Area.REGION_CODE.put(11, "Ile-de-France");
		Area.REGION_CODE.put(04, "La Réunion");
		Area.REGION_CODE.put(91, "Languedoc-Roussillon");
		Area.REGION_CODE.put(74, "Limousin");
		Area.REGION_CODE.put(41, "Lorraine");
		Area.REGION_CODE.put(02, "Martinique");
		Area.REGION_CODE.put(05, "Mayotte");
		Area.REGION_CODE.put(73, "Midi-Pyrénées");
		Area.REGION_CODE.put(31, "Nord-Pas-de-Calais");
		Area.REGION_CODE.put(52, "Pays de la Loire");
		Area.REGION_CODE.put(22, "Picardie");
		Area.REGION_CODE.put(54, "Poitou-Charentes");
		Area.REGION_CODE.put(93, "Provence alpes côte d'Azur");
		Area.REGION_CODE.put(82, "Rhone-Alpes");
	}
	
}
