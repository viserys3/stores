package com.kosuri.stores.handler;
import com.kosuri.stores.dao.SaleRepository;
import com.kosuri.stores.dao.SaleEntity;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.ArrayList;
import java.util.List;


@Service
public class SaleHandler {
    @Autowired
    private SaleRepository saleRepository;
    public void createSaleEntityFromRequest(MultipartFile reapExcelDataFile) throws Exception{

        List<SaleEntity> saleArrayList = new ArrayList<SaleEntity>();
        XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);


        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            SaleEntity tempSale = new SaleEntity();
            XSSFRow row = worksheet.getRow(i);
            tempSale.setDoc_No(row.getCell(0).getStringCellValue());
            tempSale.setReadableDocNo(row.getCell(1).getStringCellValue());
            tempSale.setDate(row.getCell(2).getDateCellValue());
            tempSale.setSuppBillNo(row.getCell(3).getStringCellValue());
            tempSale.setDate(row.getCell(4).getDateCellValue());
            tempSale.setItemCode(row.getCell(5).getStringCellValue());
            tempSale.setItemName(row.getCell(6).getStringCellValue());
            tempSale.setBatchNo(row.getCell(7).getStringCellValue());
            tempSale.setExpDt(row.getCell(8).getStringCellValue());
            tempSale.setCatCode(row.getCell(9).getStringCellValue());
            tempSale.setCatName(row.getCell(10).getStringCellValue());
            tempSale.setMfacCode(row.getCell(11).getStringCellValue());
            tempSale.setMfacName(row.getCell(12).getStringCellValue());
            tempSale.setBrandName(row.getCell(13).getStringCellValue());
            tempSale.setPacking(row.getCell(14).getStringCellValue());
            tempSale.setDcYear(row.getCell(15).getStringCellValue());
            tempSale.setDcPrefix(row.getCell(16).getStringCellValue());
            tempSale.setDcSrno(row.getCell(17).getStringCellValue());
            tempSale.setQtyBox(row.getCell(18).getStringCellValue());
            tempSale.setPackQty(row.getCell(19).getStringCellValue());
            tempSale.(row.getCell(20).getStringCellValue());
            tempSale.setSchQty(row.getCell(21).getStringCellValue());
            tempSale.setSchLooseQty(row.getCell(22).getStringCellValue());
            tempSale.setSchDisc(row.getCell(23).getStringCellValue());
            tempSale.setSaleRate(row.getCell(24).getStringCellValue());
            tempSale.setPurRate(row.getCell(25).getStringCellValue());
            tempSale.setmRP(row.getCell(26).getNumericCellValue());
            tempSale.setPurValue(row.getCell(27).getStringCellValue());
            tempSale.setDiscPer(row.getCell(28).getStringCellValue());
            tempSale.setMargin(row.getCell(29).getStringCellValue());
            tempSale.setSuppCode(row.getCell(30).getStringCellValue());
            tempSale.setSuppName(row.getCell(31).getStringCellValue());
            tempSale.setDiscValue(row.getCell(32).getStringCellValue());
            tempSale.setTaxableAmt(row.getCell(33).getStringCellValue());
            tempSale.setGstCode(row.getCell(34).getStringCellValue());
            tempSale.setcGSTPer(row.getCell(35).getStringCellValue());
            tempSale.setcGSTAmt(row.getCell(36).getStringCellValue());
            tempSale.setsGSTPer(row.getCell(37).getStringCellValue());
            tempSale.setsGSTAmt(row.getCell(38).getStringCellValue());
            tempSale.setiGSTPer(row.getCell(39).getStringCellValue());
            tempSale.setCessPer(row.getCell(40).getStringCellValue());
            tempSale.setCessAmt(row.getCell(41).getStringCellValue());


            tempSale.setTotal(row.getCell(42).getStringCellValue());
            tempSale.setPost(row.getCell(43).getStringCellValue());

            long sales = saleRepository.count();
            System.out.println("fetching repository " + sales);
            try {
                saleRepository.save(tempSale);
            }catch(Exception e){
                System.out.println(e.getCause());
            }
            saleArrayList.add(tempSale);
        }
    }
}
