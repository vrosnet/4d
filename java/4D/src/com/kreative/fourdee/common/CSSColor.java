package com.kreative.fourdee.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CSSColor {
	public static final Map<String, Integer> CSS_COLORS;
	static {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("snow", 0xFFFFFAFA);
		map.put("ghost white", 0xFFF8F8FF);
		map.put("white smoke", 0xFFF5F5F5);
		map.put("gainsboro", 0xFFDCDCDC);
		map.put("floral white", 0xFFFFFAF0);
		map.put("old lace", 0xFFFDF5E6);
		map.put("linen", 0xFFFAF0E6);
		map.put("antique white", 0xFFFAEBD7);
		map.put("papaya whip", 0xFFFFEFD5);
		map.put("blanched almond", 0xFFFFEBCD);
		map.put("bisque", 0xFFFFE4C4);
		map.put("peach puff", 0xFFFFDAB9);
		map.put("navajo white", 0xFFFFDEAD);
		map.put("moccasin", 0xFFFFE4B5);
		map.put("cornsilk", 0xFFFFF8DC);
		map.put("ivory", 0xFFFFFFF0);
		map.put("lemon chiffon", 0xFFFFFACD);
		map.put("seashell", 0xFFFFF5EE);
		map.put("honeydew", 0xFFF0FFF0);
		map.put("mint cream", 0xFFF5FFFA);
		map.put("azure", 0xFFF0FFFF);
		map.put("alice blue", 0xFFF0F8FF);
		map.put("lavender", 0xFFE6E6FA);
		map.put("lavender blush", 0xFFFFF0F5);
		map.put("misty rose", 0xFFFFE4E1);
		map.put("white", 0xFFFFFFFF);
		map.put("black", 0xFF000000);
		map.put("dark slate gray", 0xFF2F4F4F);
		map.put("dim gray", 0xFF696969);
		map.put("slate gray", 0xFF708090);
		map.put("light slate gray", 0xFF778899);
		map.put("gray", 0xFFBEBEBE);
		map.put("light gray", 0xFFD3D3D3);
		map.put("midnight blue", 0xFF191970);
		map.put("navy", 0xFF000080);
		map.put("navy blue", 0xFF000080);
		map.put("cornflower blue", 0xFF6495ED);
		map.put("dark slate blue", 0xFF483D8B);
		map.put("slate blue", 0xFF6A5ACD);
		map.put("medium slate blue", 0xFF7B68EE);
		map.put("light slate blue", 0xFF8470FF);
		map.put("medium blue", 0xFF0000CD);
		map.put("royal blue", 0xFF4169E1);
		map.put("blue", 0xFF0000FF);
		map.put("dodger blue", 0xFF1E90FF);
		map.put("deep sky blue", 0xFF00BFFF);
		map.put("sky blue", 0xFF87CEEB);
		map.put("light sky blue", 0xFF87CEFA);
		map.put("steel blue", 0xFF4682B4);
		map.put("light steel blue", 0xFFB0C4DE);
		map.put("light blue", 0xFFADD8E6);
		map.put("powder blue", 0xFFB0E0E6);
		map.put("pale turquoise", 0xFFAFEEEE);
		map.put("dark turquoise", 0xFF00CED1);
		map.put("medium turquoise", 0xFF48D1CC);
		map.put("turquoise", 0xFF40E0D0);
		map.put("cyan", 0xFF00FFFF);
		map.put("light cyan", 0xFFE0FFFF);
		map.put("cadet blue", 0xFF5F9EA0);
		map.put("medium aquamarine", 0xFF66CDAA);
		map.put("aquamarine", 0xFF7FFFD4);
		map.put("dark green", 0xFF006400);
		map.put("dark olive green", 0xFF556B2F);
		map.put("dark sea green", 0xFF8FBC8F);
		map.put("sea green", 0xFF2E8B57);
		map.put("medium sea green", 0xFF3CB371);
		map.put("light sea green", 0xFF20B2AA);
		map.put("pale green", 0xFF98FB98);
		map.put("spring green", 0xFF00FF7F);
		map.put("lawn green", 0xFF7CFC00);
		map.put("green", 0xFF00FF00);
		map.put("chartreuse", 0xFF7FFF00);
		map.put("medium spring green", 0xFF00FA9A);
		map.put("green yellow", 0xFFADFF2F);
		map.put("lime green", 0xFF32CD32);
		map.put("yellow green", 0xFF9ACD32);
		map.put("forest green", 0xFF228B22);
		map.put("olive drab", 0xFF6B8E23);
		map.put("dark khaki", 0xFFBDB76B);
		map.put("khaki", 0xFFF0E68C);
		map.put("pale goldenrod", 0xFFEEE8AA);
		map.put("light goldenrod yellow", 0xFFFAFAD2);
		map.put("light yellow", 0xFFFFFFE0);
		map.put("yellow", 0xFFFFFF00);
		map.put("gold", 0xFFFFD700);
		map.put("light goldenrod", 0xFFEEDD82);
		map.put("goldenrod", 0xFFDAA520);
		map.put("dark goldenrod", 0xFFB8860B);
		map.put("rosy brown", 0xFFBC8F8F);
		map.put("indian red", 0xFFCD5C5C);
		map.put("saddle brown", 0xFF8B4513);
		map.put("sienna", 0xFFA0522D);
		map.put("peru", 0xFFCD853F);
		map.put("burlywood", 0xFFDEB887);
		map.put("beige", 0xFFF5F5DC);
		map.put("wheat", 0xFFF5DEB3);
		map.put("sandy brown", 0xFFF4A460);
		map.put("tan", 0xFFD2B48C);
		map.put("chocolate", 0xFFD2691E);
		map.put("firebrick", 0xFFB22222);
		map.put("brown", 0xFFA52A2A);
		map.put("dark salmon", 0xFFE9967A);
		map.put("salmon", 0xFFFA8072);
		map.put("light salmon", 0xFFFFA07A);
		map.put("orange", 0xFFFFA500);
		map.put("dark orange", 0xFFFF8C00);
		map.put("coral", 0xFFFF7F50);
		map.put("light coral", 0xFFF08080);
		map.put("tomato", 0xFFFF6347);
		map.put("orange red", 0xFFFF4500);
		map.put("red", 0xFFFF0000);
		map.put("hot pink", 0xFFFF69B4);
		map.put("deep pink", 0xFFFF1493);
		map.put("pink", 0xFFFFC0CB);
		map.put("light pink", 0xFFFFB6C1);
		map.put("pale violet red", 0xFFDB7093);
		map.put("maroon", 0xFFB03060);
		map.put("medium violet red", 0xFFC71585);
		map.put("violet red", 0xFFD02090);
		map.put("magenta", 0xFFFF00FF);
		map.put("violet", 0xFFEE82EE);
		map.put("plum", 0xFFDDA0DD);
		map.put("orchid", 0xFFDA70D6);
		map.put("medium orchid", 0xFFBA55D3);
		map.put("dark orchid", 0xFF9932CC);
		map.put("dark violet", 0xFF9400D3);
		map.put("blue violet", 0xFF8A2BE2);
		map.put("purple", 0xFFA020F0);
		map.put("medium purple", 0xFF9370DB);
		map.put("thistle", 0xFFD8BFD8);
		map.put("snow 1", 0xFFFFFAFA);
		map.put("snow 2", 0xFFEEE9E9);
		map.put("snow 3", 0xFFCDC9C9);
		map.put("snow 4", 0xFF8B8989);
		map.put("seashell 1", 0xFFFFF5EE);
		map.put("seashell 2", 0xFFEEE5DE);
		map.put("seashell 3", 0xFFCDC5BF);
		map.put("seashell 4", 0xFF8B8682);
		map.put("antique white 1", 0xFFFFEFDB);
		map.put("antique white 2", 0xFFEEDFCC);
		map.put("antique white 3", 0xFFCDC0B0);
		map.put("antique white 4", 0xFF8B8378);
		map.put("bisque 1", 0xFFFFE4C4);
		map.put("bisque 2", 0xFFEED5B7);
		map.put("bisque 3", 0xFFCDB79E);
		map.put("bisque 4", 0xFF8B7D6B);
		map.put("peach puff 1", 0xFFFFDAB9);
		map.put("peach puff 2", 0xFFEECBAD);
		map.put("peach puff 3", 0xFFCDAF95);
		map.put("peach puff 4", 0xFF8B7765);
		map.put("navajo white 1", 0xFFFFDEAD);
		map.put("navajo white 2", 0xFFEECFA1);
		map.put("navajo white 3", 0xFFCDB38B);
		map.put("navajo white 4", 0xFF8B795E);
		map.put("lemon chiffon 1", 0xFFFFFACD);
		map.put("lemon chiffon 2", 0xFFEEE9BF);
		map.put("lemon chiffon 3", 0xFFCDC9A5);
		map.put("lemon chiffon 4", 0xFF8B8970);
		map.put("cornsilk 1", 0xFFFFF8DC);
		map.put("cornsilk 2", 0xFFEEE8CD);
		map.put("cornsilk 3", 0xFFCDC8B1);
		map.put("cornsilk 4", 0xFF8B8878);
		map.put("ivory 1", 0xFFFFFFF0);
		map.put("ivory 2", 0xFFEEEEE0);
		map.put("ivory 3", 0xFFCDCDC1);
		map.put("ivory 4", 0xFF8B8B83);
		map.put("honeydew 1", 0xFFF0FFF0);
		map.put("honeydew 2", 0xFFE0EEE0);
		map.put("honeydew 3", 0xFFC1CDC1);
		map.put("honeydew 4", 0xFF838B83);
		map.put("lavender blush 1", 0xFFFFF0F5);
		map.put("lavender blush 2", 0xFFEEE0E5);
		map.put("lavender blush 3", 0xFFCDC1C5);
		map.put("lavender blush 4", 0xFF8B8386);
		map.put("misty rose 1", 0xFFFFE4E1);
		map.put("misty rose 2", 0xFFEED5D2);
		map.put("misty rose 3", 0xFFCDB7B5);
		map.put("misty rose 4", 0xFF8B7D7B);
		map.put("azure 1", 0xFFF0FFFF);
		map.put("azure 2", 0xFFE0EEEE);
		map.put("azure 3", 0xFFC1CDCD);
		map.put("azure 4", 0xFF838B8B);
		map.put("slate blue 1", 0xFF836FFF);
		map.put("slate blue 2", 0xFF7A67EE);
		map.put("slate blue 3", 0xFF6959CD);
		map.put("slate blue 4", 0xFF473C8B);
		map.put("royal blue 1", 0xFF4876FF);
		map.put("royal blue 2", 0xFF436EEE);
		map.put("royal blue 3", 0xFF3A5FCD);
		map.put("royal blue 4", 0xFF27408B);
		map.put("blue 1", 0xFF0000FF);
		map.put("blue 2", 0xFF0000EE);
		map.put("blue 3", 0xFF0000CD);
		map.put("blue 4", 0xFF00008B);
		map.put("dodger blue 1", 0xFF1E90FF);
		map.put("dodger blue 2", 0xFF1C86EE);
		map.put("dodger blue 3", 0xFF1874CD);
		map.put("dodger blue 4", 0xFF104E8B);
		map.put("steel blue 1", 0xFF63B8FF);
		map.put("steel blue 2", 0xFF5CACEE);
		map.put("steel blue 3", 0xFF4F94CD);
		map.put("steel blue 4", 0xFF36648B);
		map.put("deep sky blue 1", 0xFF00BFFF);
		map.put("deep sky blue 2", 0xFF00B2EE);
		map.put("deep sky blue 3", 0xFF009ACD);
		map.put("deep sky blue 4", 0xFF00688B);
		map.put("sky blue 1", 0xFF87CEFF);
		map.put("sky blue 2", 0xFF7EC0EE);
		map.put("sky blue 3", 0xFF6CA6CD);
		map.put("sky blue 4", 0xFF4A708B);
		map.put("light sky blue 1", 0xFFB0E2FF);
		map.put("light sky blue 2", 0xFFA4D3EE);
		map.put("light sky blue 3", 0xFF8DB6CD);
		map.put("light sky blue 4", 0xFF607B8B);
		map.put("slate gray 1", 0xFFC6E2FF);
		map.put("slate gray 2", 0xFFB9D3EE);
		map.put("slate gray 3", 0xFF9FB6CD);
		map.put("slate gray 4", 0xFF6C7B8B);
		map.put("light steel blue 1", 0xFFCAE1FF);
		map.put("light steel blue 2", 0xFFBCD2EE);
		map.put("light steel blue 3", 0xFFA2B5CD);
		map.put("light steel blue 4", 0xFF6E7B8B);
		map.put("light blue 1", 0xFFBFEFFF);
		map.put("light blue 2", 0xFFB2DFEE);
		map.put("light blue 3", 0xFF9AC0CD);
		map.put("light blue 4", 0xFF68838B);
		map.put("light cyan 1", 0xFFE0FFFF);
		map.put("light cyan 2", 0xFFD1EEEE);
		map.put("light cyan 3", 0xFFB4CDCD);
		map.put("light cyan 4", 0xFF7A8B8B);
		map.put("pale turquoise 1", 0xFFBBFFFF);
		map.put("pale turquoise 2", 0xFFAEEEEE);
		map.put("pale turquoise 3", 0xFF96CDCD);
		map.put("pale turquoise 4", 0xFF668B8B);
		map.put("cadet blue 1", 0xFF98F5FF);
		map.put("cadet blue 2", 0xFF8EE5EE);
		map.put("cadet blue 3", 0xFF7AC5CD);
		map.put("cadet blue 4", 0xFF53868B);
		map.put("turquoise 1", 0xFF00F5FF);
		map.put("turquoise 2", 0xFF00E5EE);
		map.put("turquoise 3", 0xFF00C5CD);
		map.put("turquoise 4", 0xFF00868B);
		map.put("cyan 1", 0xFF00FFFF);
		map.put("cyan 2", 0xFF00EEEE);
		map.put("cyan 3", 0xFF00CDCD);
		map.put("cyan 4", 0xFF008B8B);
		map.put("dark slate gray 1", 0xFF97FFFF);
		map.put("dark slate gray 2", 0xFF8DEEEE);
		map.put("dark slate gray 3", 0xFF79CDCD);
		map.put("dark slate gray 4", 0xFF528B8B);
		map.put("aquamarine 1", 0xFF7FFFD4);
		map.put("aquamarine 2", 0xFF76EEC6);
		map.put("aquamarine 3", 0xFF66CDAA);
		map.put("aquamarine 4", 0xFF458B74);
		map.put("dark sea green 1", 0xFFC1FFC1);
		map.put("dark sea green 2", 0xFFB4EEB4);
		map.put("dark sea green 3", 0xFF9BCD9B);
		map.put("dark sea green 4", 0xFF698B69);
		map.put("sea green 1", 0xFF54FF9F);
		map.put("sea green 2", 0xFF4EEE94);
		map.put("sea green 3", 0xFF43CD80);
		map.put("sea green 4", 0xFF2E8B57);
		map.put("pale green 1", 0xFF9AFF9A);
		map.put("pale green 2", 0xFF90EE90);
		map.put("pale green 3", 0xFF7CCD7C);
		map.put("pale green 4", 0xFF548B54);
		map.put("spring green 1", 0xFF00FF7F);
		map.put("spring green 2", 0xFF00EE76);
		map.put("spring green 3", 0xFF00CD66);
		map.put("spring green 4", 0xFF008B45);
		map.put("green 1", 0xFF00FF00);
		map.put("green 2", 0xFF00EE00);
		map.put("green 3", 0xFF00CD00);
		map.put("green 4", 0xFF008B00);
		map.put("chartreuse 1", 0xFF7FFF00);
		map.put("chartreuse 2", 0xFF76EE00);
		map.put("chartreuse 3", 0xFF66CD00);
		map.put("chartreuse 4", 0xFF458B00);
		map.put("olive drab 1", 0xFFC0FF3E);
		map.put("olive drab 2", 0xFFB3EE3A);
		map.put("olive drab 3", 0xFF9ACD32);
		map.put("olive drab 4", 0xFF698B22);
		map.put("dark olive green 1", 0xFFCAFF70);
		map.put("dark olive green 2", 0xFFBCEE68);
		map.put("dark olive green 3", 0xFFA2CD5A);
		map.put("dark olive green 4", 0xFF6E8B3D);
		map.put("khaki 1", 0xFFFFF68F);
		map.put("khaki 2", 0xFFEEE685);
		map.put("khaki 3", 0xFFCDC673);
		map.put("khaki 4", 0xFF8B864E);
		map.put("light goldenrod 1", 0xFFFFEC8B);
		map.put("light goldenrod 2", 0xFFEEDC82);
		map.put("light goldenrod 3", 0xFFCDBE70);
		map.put("light goldenrod 4", 0xFF8B814C);
		map.put("light yellow 1", 0xFFFFFFE0);
		map.put("light yellow 2", 0xFFEEEED1);
		map.put("light yellow 3", 0xFFCDCDB4);
		map.put("light yellow 4", 0xFF8B8B7A);
		map.put("yellow 1", 0xFFFFFF00);
		map.put("yellow 2", 0xFFEEEE00);
		map.put("yellow 3", 0xFFCDCD00);
		map.put("yellow 4", 0xFF8B8B00);
		map.put("gold 1", 0xFFFFD700);
		map.put("gold 2", 0xFFEEC900);
		map.put("gold 3", 0xFFCDAD00);
		map.put("gold 4", 0xFF8B7500);
		map.put("goldenrod 1", 0xFFFFC125);
		map.put("goldenrod 2", 0xFFEEB422);
		map.put("goldenrod 3", 0xFFCD9B1D);
		map.put("goldenrod 4", 0xFF8B6914);
		map.put("dark goldenrod 1", 0xFFFFB90F);
		map.put("dark goldenrod 2", 0xFFEEAD0E);
		map.put("dark goldenrod 3", 0xFFCD950C);
		map.put("dark goldenrod 4", 0xFF8B6508);
		map.put("rosy brown 1", 0xFFFFC1C1);
		map.put("rosy brown 2", 0xFFEEB4B4);
		map.put("rosy brown 3", 0xFFCD9B9B);
		map.put("rosy brown 4", 0xFF8B6969);
		map.put("indian red 1", 0xFFFF6A6A);
		map.put("indian red 2", 0xFFEE6363);
		map.put("indian red 3", 0xFFCD5555);
		map.put("indian red 4", 0xFF8B3A3A);
		map.put("sienna 1", 0xFFFF8247);
		map.put("sienna 2", 0xFFEE7942);
		map.put("sienna 3", 0xFFCD6839);
		map.put("sienna 4", 0xFF8B4726);
		map.put("burlywood 1", 0xFFFFD39B);
		map.put("burlywood 2", 0xFFEEC591);
		map.put("burlywood 3", 0xFFCDAA7D);
		map.put("burlywood 4", 0xFF8B7355);
		map.put("wheat 1", 0xFFFFE7BA);
		map.put("wheat 2", 0xFFEED8AE);
		map.put("wheat 3", 0xFFCDBA96);
		map.put("wheat 4", 0xFF8B7E66);
		map.put("tan 1", 0xFFFFA54F);
		map.put("tan 2", 0xFFEE9A49);
		map.put("tan 3", 0xFFCD853F);
		map.put("tan 4", 0xFF8B5A2B);
		map.put("chocolate 1", 0xFFFF7F24);
		map.put("chocolate 2", 0xFFEE7621);
		map.put("chocolate 3", 0xFFCD661D);
		map.put("chocolate 4", 0xFF8B4513);
		map.put("firebrick 1", 0xFFFF3030);
		map.put("firebrick 2", 0xFFEE2C2C);
		map.put("firebrick 3", 0xFFCD2626);
		map.put("firebrick 4", 0xFF8B1A1A);
		map.put("brown 1", 0xFFFF4040);
		map.put("brown 2", 0xFFEE3B3B);
		map.put("brown 3", 0xFFCD3333);
		map.put("brown 4", 0xFF8B2323);
		map.put("salmon 1", 0xFFFF8C69);
		map.put("salmon 2", 0xFFEE8262);
		map.put("salmon 3", 0xFFCD7054);
		map.put("salmon 4", 0xFF8B4C39);
		map.put("light salmon 1", 0xFFFFA07A);
		map.put("light salmon 2", 0xFFEE9572);
		map.put("light salmon 3", 0xFFCD8162);
		map.put("light salmon 4", 0xFF8B5742);
		map.put("orange 1", 0xFFFFA500);
		map.put("orange 2", 0xFFEE9A00);
		map.put("orange 3", 0xFFCD8500);
		map.put("orange 4", 0xFF8B5A00);
		map.put("dark orange 1", 0xFFFF7F00);
		map.put("dark orange 2", 0xFFEE7600);
		map.put("dark orange 3", 0xFFCD6600);
		map.put("dark orange 4", 0xFF8B4500);
		map.put("coral 1", 0xFFFF7256);
		map.put("coral 2", 0xFFEE6A50);
		map.put("coral 3", 0xFFCD5B45);
		map.put("coral 4", 0xFF8B3E2F);
		map.put("tomato 1", 0xFFFF6347);
		map.put("tomato 2", 0xFFEE5C42);
		map.put("tomato 3", 0xFFCD4F39);
		map.put("tomato 4", 0xFF8B3626);
		map.put("orange red 1", 0xFFFF4500);
		map.put("orange red 2", 0xFFEE4000);
		map.put("orange red 3", 0xFFCD3700);
		map.put("orange red 4", 0xFF8B2500);
		map.put("red 1", 0xFFFF0000);
		map.put("red 2", 0xFFEE0000);
		map.put("red 3", 0xFFCD0000);
		map.put("red 4", 0xFF8B0000);
		map.put("deep pink 1", 0xFFFF1493);
		map.put("deep pink 2", 0xFFEE1289);
		map.put("deep pink 3", 0xFFCD1076);
		map.put("deep pink 4", 0xFF8B0A50);
		map.put("hot pink 1", 0xFFFF6EB4);
		map.put("hot pink 2", 0xFFEE6AA7);
		map.put("hot pink 3", 0xFFCD6090);
		map.put("hot pink 4", 0xFF8B3A62);
		map.put("pink 1", 0xFFFFB5C5);
		map.put("pink 2", 0xFFEEA9B8);
		map.put("pink 3", 0xFFCD919E);
		map.put("pink 4", 0xFF8B636C);
		map.put("light pink 1", 0xFFFFAEB9);
		map.put("light pink 2", 0xFFEEA2AD);
		map.put("light pink 3", 0xFFCD8C95);
		map.put("light pink 4", 0xFF8B5F65);
		map.put("pale violet red 1", 0xFFFF82AB);
		map.put("pale violet red 2", 0xFFEE799F);
		map.put("pale violet red 3", 0xFFCD6889);
		map.put("pale violet red 4", 0xFF8B475D);
		map.put("maroon 1", 0xFFFF34B3);
		map.put("maroon 2", 0xFFEE30A7);
		map.put("maroon 3", 0xFFCD2990);
		map.put("maroon 4", 0xFF8B1C62);
		map.put("violet red 1", 0xFFFF3E96);
		map.put("violet red 2", 0xFFEE3A8C);
		map.put("violet red 3", 0xFFCD3278);
		map.put("violet red 4", 0xFF8B2252);
		map.put("magenta 1", 0xFFFF00FF);
		map.put("magenta 2", 0xFFEE00EE);
		map.put("magenta 3", 0xFFCD00CD);
		map.put("magenta 4", 0xFF8B008B);
		map.put("orchid 1", 0xFFFF83FA);
		map.put("orchid 2", 0xFFEE7AE9);
		map.put("orchid 3", 0xFFCD69C9);
		map.put("orchid 4", 0xFF8B4789);
		map.put("plum 1", 0xFFFFBBFF);
		map.put("plum 2", 0xFFEEAEEE);
		map.put("plum 3", 0xFFCD96CD);
		map.put("plum 4", 0xFF8B668B);
		map.put("medium orchid 1", 0xFFE066FF);
		map.put("medium orchid 2", 0xFFD15FEE);
		map.put("medium orchid 3", 0xFFB452CD);
		map.put("medium orchid 4", 0xFF7A378B);
		map.put("dark orchid 1", 0xFFBF3EFF);
		map.put("dark orchid 2", 0xFFB23AEE);
		map.put("dark orchid 3", 0xFF9A32CD);
		map.put("dark orchid 4", 0xFF68228B);
		map.put("purple 1", 0xFF9B30FF);
		map.put("purple 2", 0xFF912CEE);
		map.put("purple 3", 0xFF7D26CD);
		map.put("purple 4", 0xFF551A8B);
		map.put("medium purple 1", 0xFFAB82FF);
		map.put("medium purple 2", 0xFF9F79EE);
		map.put("medium purple 3", 0xFF8968CD);
		map.put("medium purple 4", 0xFF5D478B);
		map.put("thistle 1", 0xFFFFE1FF);
		map.put("thistle 2", 0xFFEED2EE);
		map.put("thistle 3", 0xFFCDB5CD);
		map.put("thistle 4", 0xFF8B7B8B);
		map.put("gray 0", 0xFF000000);
		map.put("gray 1", 0xFF030303);
		map.put("gray 2", 0xFF050505);
		map.put("gray 3", 0xFF080808);
		map.put("gray 4", 0xFF0A0A0A);
		map.put("gray 5", 0xFF0D0D0D);
		map.put("gray 6", 0xFF0F0F0F);
		map.put("gray 7", 0xFF121212);
		map.put("gray 8", 0xFF141414);
		map.put("gray 9", 0xFF171717);
		map.put("gray 10", 0xFF1A1A1A);
		map.put("gray 11", 0xFF1C1C1C);
		map.put("gray 12", 0xFF1F1F1F);
		map.put("gray 13", 0xFF212121);
		map.put("gray 14", 0xFF242424);
		map.put("gray 15", 0xFF262626);
		map.put("gray 16", 0xFF292929);
		map.put("gray 17", 0xFF2B2B2B);
		map.put("gray 18", 0xFF2E2E2E);
		map.put("gray 19", 0xFF303030);
		map.put("gray 20", 0xFF333333);
		map.put("gray 21", 0xFF363636);
		map.put("gray 22", 0xFF383838);
		map.put("gray 23", 0xFF3B3B3B);
		map.put("gray 24", 0xFF3D3D3D);
		map.put("gray 25", 0xFF404040);
		map.put("gray 26", 0xFF424242);
		map.put("gray 27", 0xFF454545);
		map.put("gray 28", 0xFF474747);
		map.put("gray 29", 0xFF4A4A4A);
		map.put("gray 30", 0xFF4D4D4D);
		map.put("gray 31", 0xFF4F4F4F);
		map.put("gray 32", 0xFF525252);
		map.put("gray 33", 0xFF545454);
		map.put("gray 34", 0xFF575757);
		map.put("gray 35", 0xFF595959);
		map.put("gray 36", 0xFF5C5C5C);
		map.put("gray 37", 0xFF5E5E5E);
		map.put("gray 38", 0xFF616161);
		map.put("gray 39", 0xFF636363);
		map.put("gray 40", 0xFF666666);
		map.put("gray 41", 0xFF696969);
		map.put("gray 42", 0xFF6B6B6B);
		map.put("gray 43", 0xFF6E6E6E);
		map.put("gray 44", 0xFF707070);
		map.put("gray 45", 0xFF737373);
		map.put("gray 46", 0xFF757575);
		map.put("gray 47", 0xFF787878);
		map.put("gray 48", 0xFF7A7A7A);
		map.put("gray 49", 0xFF7D7D7D);
		map.put("gray 50", 0xFF7F7F7F);
		map.put("gray 51", 0xFF828282);
		map.put("gray 52", 0xFF858585);
		map.put("gray 53", 0xFF878787);
		map.put("gray 54", 0xFF8A8A8A);
		map.put("gray 55", 0xFF8C8C8C);
		map.put("gray 56", 0xFF8F8F8F);
		map.put("gray 57", 0xFF919191);
		map.put("gray 58", 0xFF949494);
		map.put("gray 59", 0xFF969696);
		map.put("gray 60", 0xFF999999);
		map.put("gray 61", 0xFF9C9C9C);
		map.put("gray 62", 0xFF9E9E9E);
		map.put("gray 63", 0xFFA1A1A1);
		map.put("gray 64", 0xFFA3A3A3);
		map.put("gray 65", 0xFFA6A6A6);
		map.put("gray 66", 0xFFA8A8A8);
		map.put("gray 67", 0xFFABABAB);
		map.put("gray 68", 0xFFADADAD);
		map.put("gray 69", 0xFFB0B0B0);
		map.put("gray 70", 0xFFB3B3B3);
		map.put("gray 71", 0xFFB5B5B5);
		map.put("gray 72", 0xFFB8B8B8);
		map.put("gray 73", 0xFFBABABA);
		map.put("gray 74", 0xFFBDBDBD);
		map.put("gray 75", 0xFFBFBFBF);
		map.put("gray 76", 0xFFC2C2C2);
		map.put("gray 77", 0xFFC4C4C4);
		map.put("gray 78", 0xFFC7C7C7);
		map.put("gray 79", 0xFFC9C9C9);
		map.put("gray 80", 0xFFCCCCCC);
		map.put("gray 81", 0xFFCFCFCF);
		map.put("gray 82", 0xFFD1D1D1);
		map.put("gray 83", 0xFFD4D4D4);
		map.put("gray 84", 0xFFD6D6D6);
		map.put("gray 85", 0xFFD9D9D9);
		map.put("gray 86", 0xFFDBDBDB);
		map.put("gray 87", 0xFFDEDEDE);
		map.put("gray 88", 0xFFE0E0E0);
		map.put("gray 89", 0xFFE3E3E3);
		map.put("gray 90", 0xFFE5E5E5);
		map.put("gray 91", 0xFFE8E8E8);
		map.put("gray 92", 0xFFEBEBEB);
		map.put("gray 93", 0xFFEDEDED);
		map.put("gray 94", 0xFFF0F0F0);
		map.put("gray 95", 0xFFF2F2F2);
		map.put("gray 96", 0xFFF5F5F5);
		map.put("gray 97", 0xFFF7F7F7);
		map.put("gray 98", 0xFFFAFAFA);
		map.put("gray 99", 0xFFFCFCFC);
		map.put("gray 100", 0xFFFFFFFF);
		map.put("dark gray", 0xFFA9A9A9);
		map.put("dark blue", 0xFF00008B);
		map.put("dark cyan", 0xFF008B8B);
		map.put("dark magenta", 0xFF8B008B);
		map.put("dark red", 0xFF8B0000);
		map.put("light green", 0xFF90EE90);
		CSS_COLORS = Collections.unmodifiableMap(map);
	}
	
	public static int parse(String name) {
		name = name.replaceAll("[^A-Za-z0-9]+", " ").trim().toLowerCase();
		if (CSS_COLORS.containsKey(name)) {
			return CSS_COLORS.get(name);
		} else {
			return 0;
		}
	}
}