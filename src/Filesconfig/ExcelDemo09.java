package Filesconfig;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo09 {
    public static void main(String[] args) throws IOException {
      // var excelData= ExcelReader.read();
        List<Map<String,String>> excelData=ExcelReader.read();
       // Map<String,String>firstRow=excelData.get(0);
     //   System.out.println(firstRow.get("Name"));
        Map<String,String>firstRow=excelData.get(1);
        System.out.println(firstRow.get("Salary"));
        for(Map<String,String>row:excelData){
            for(var entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("********");
        }
    }
}
