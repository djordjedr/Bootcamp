/*
List<String> darijineVakcine = new ArrayList<String>();
		
		darijineVakcine.add("Fajzerova");
		darijineVakcine.add("Sputnjik V");
		
		ClanKriznogStaba c1 = new ClanKriznogStaba("Predrag", "Kon", "lekar");
		ClanKriznogStaba c2 = new ClanKriznogStaba("Darija", "Kisic Tepavcevic", "lekar", darijineVakcine);
		ClanKriznogStaba c3 = new ClanKriznogStaba("Branimir", "Nestorovic", "lekar");
		
		List<ClanKriznogStaba> krizniStab = new ArrayList<ClanKriznogStaba>();
		
		krizniStab.add(c1);
		krizniStab.add(c2);
		krizniStab.add(c3);
		
		for (int i = 0; i < krizniStab.size(); i++)
			System.out.println(krizniStab.get(i).toString());
		
		System.out.println(krizniStab.size());
		
		ClanKriznogStaba n = krizniStab.get(1);
		
		n.setZanimanje("ministarka");
		
		krizniStab.remove(2);
		
		System.out.println(krizniStab.size());
		
		List<String> konoveVakcine = new ArrayList<String>();
		
		konoveVakcine.add("Fajzerova");
		konoveVakcine.add("kineska");
		
		c1.setVakcine(konoveVakcine);
		
		for(int i = 0; i < 2; i++)
			System.out.println(krizniStab.get(0).getVakcine().get(i));
	}
*/