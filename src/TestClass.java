public class TestClass {
    public static void main(String[] args){
       DocumentFactory wordf = new WordFactory();
       Document word = wordf.CreateDocument();
       word.open();


       DocumentFactory pdf = new PdfFactory();
       Document np = pdf.CreateDocument();
       word.open();

       DocumentFactory excelF = new ExcelFactory();
       Document excel = excelF.CreateDocument();
       excel.open();

    }
}
