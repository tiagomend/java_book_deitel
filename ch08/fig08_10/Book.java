// Declarando um tipo enum com um construtor  e campos de instância

public enum Book
{
    // Declarando constantes do tipo enum
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // Campos de instância
    private final String title;
    private final String copyrightYear;

    // Construtor enum
    Book(String title, String copyrightYear)
    {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle()
    {
        return title;
    }

    public String getCopyrightYear()
    {
        return copyrightYear;
    }
}