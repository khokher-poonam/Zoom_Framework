package co.pragra.learning.fullstackqa.b15framework.testcases;
import co.pragra.learning.fullstackqa.b15framework.data.ExcelData;
import co.pragra.learning.fullstackqa.b15framework.data.LoginDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dummy {
    //#######################For retrieve Login Excel sheet data################
    @Test
    public void test()
    {
        ExcelData excelData=new ExcelData();
        List<Object[]> data=excelData.getSheetData( "Login");
        data.forEach(s->System.out.println(Arrays.toString(s)));
    }

    @Test(dataProvider="loginProvider" ,dataProviderClass = LoginDataProvider.class)
    public void test(String Username,String password){
        System.out.println(Username);
        System.out.println(password);
    }
    //#######################For retrieve Contact Excel sheet data################
    @Test
    public void test2()
    {
        ExcelData excelData=new ExcelData();
        List<Object[]> data=excelData.getSheetData( "Contact");
        data.forEach(s->System.out.println(Arrays.toString(s)));
    }
////////////////////////////////////////////////////////////////////////////////////////

  @Test(dataProvider = "dummyDataProvider")
    public void test(String name, int num){
        System.out.println("testing");
        System.out.println(name + "  "+ num);
    }

    @DataProvider
    public Object[][] dummyDataProvider(){
        return new Object[][] {
                                    {"Atin",11} ,
                                    {"Vivek",12}
                               };
    }

    @DataProvider
    public Iterator<Object []> anotheDataProvider(){
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Cat", 23});
        data.add(new Object[]{"Dog", 90});
        return data.iterator();
    }
}
