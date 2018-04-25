
public enum ScrapbookPages {

	FRONT_COVER(), PAGE1(), PAGE2(),
	      PAGE3(), PAGE4(), PAGE5(),
	      PAGE6(), PAGE7(), PAGE8(),
	      PAGE9(), PAGE10(), PAGE11(),
	      PAGE12(), PAGE13(), PAGE14(),
	      PAGE15(), PAGE16(), PAGE17(),
	      PAGE18(), PAGE19(), PAGE20(),
	      PAGE21(), PAGE22(), PAGE23(),
	      PAGE24(), PAGE25(), PAGE26(),
	BACK_COVER();
	     

	private final Image ARTIFACT;
	private final String TEXT;
	private final String TITLE;
	
	private ScrapbookPages(Image img, String text, String title)
	{
		this.ARTIFACT = img;
		this.TEXT = text;
		this.TITLE = title;
	}


}
