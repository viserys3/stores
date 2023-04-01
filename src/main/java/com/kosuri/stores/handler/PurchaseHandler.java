package com.kosuri.stores.handler;

import com.kosuri.stores.dao.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Service
public class PurchaseHandler {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public void createPurchaseEntityFromRequest(MultipartFile reapExcelDataFile){

        List<PurchaseEntity> purchaseArrayList = new ArrayList<PurchaseEntity>();
        XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);


        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            PurchaseEntity tempPurchase = new PurchaseEntity();


            XSSFRow row = worksheet.getRow(i);


            tempPurchase.setDoc_No((int) row.getCell(0).getNumericCellValue());
            tempStudent.setReadableDocNo(row.getCell(1).getStringCellValue());
            tempPurchase.setDate(row.getCell(2).getStringCellValue());
            tempPurchase.setBillNo(row.getCell(3).getStringCellValue());
            tempPurchase.setBillDt(row.getCell(4).getStringCellValue());
            tempPurchase.setItemCode(row.getCell(5).getStringCellValue());
            tempPurchase.setItemName(row.getCell(6).getStringCellValue());
            tempPurchase.setBatchNo(row.getCell(7).getStringCellValue());
            tempPurchase.setExpiryDate(row.getCell(8).getStringCellValue());
            tempPurchase.setCatCode(row.getCell(9).getStringCellValue());
            tempPurchase.setCatName(row.getCell(10).getStringCellValue());
            tempPurchase.setMfacCode(row.getCell(11).getStringCellValue());
            tempPurchase.setMfacName(row.getCell(12).getStringCellValue());
            tempPurchase.setBrandName(row.getCell(13).getStringCellValue());
            tempPurchase.setPacking(row.getCell(14).getStringCellValue());
            tempPurchase.setDcYear(row.getCell(15).getStringCellValue());
            tempPurchase.setDcPrefix(row.getCell(16).getStringCellValue());
            tempPurchase.setDcSrno(row.getCell(17).getStringCellValue());
            tempPurchase.setQtyBox(row.getCell(18).getStringCellValue());
            tempPurchase.setPackQty(row.getCell(19).getStringCellValue());
            tempPurchase.setLooseQty(row.getCell(20).getStringCellValue());
            tempPurchase.setSchPackQty(row.getCell(21).getStringCellValue());
            tempPurchase.setSchLooseQty(row.getCell(22).getStringCellValue());
            tempPurchase.setSchDisc(row.getCell(23).getStringCellValue());
            tempPurchase.setSaleRate(row.getCell(24).getStringCellValue());
            tempPurchase.setPurRate(row.getCell(25).getStringCellValue());
            tempPurchase.setMRP(row.getCell(26).getStringCellValue());
            tempPurchase.setPurValue(row.getCell(27).getStringCellValue());
            tempPurchase.setDiscPer(row.getCell(28).getStringCellValue());
            tempPurchase.setMargin(row.getCell(29).getStringCellValue());
            tempPurchase.setSuppCode(row.getCell(30).getStringCellValue());
            tempPurchase.setSuppName(row.getCell(31).getStringCellValue());
            tempPurchase.setDiscValue(row.getCell(32).getStringCellValue());
            tempPurchase.setTaxableAmt(row.getCell(33).getStringCellValue());
            tempPurchase.setGstCode(row.getCell(34).getStringCellValue());
            tempPurchase.setcGSTPer(row.getCell(35).getStringCellValue());
            tempPurchase.setcGSTAmt(row.getCell(36).getStringCellValue());
            tempPurchase.setsGSTPer(row.getCell(37).getStringCellValue());
            tempPurchase.setsGSTAmt(row.getCell(38).getStringCellValue());
            tempPurchase.setiGSTPer(row.getCell(39).getStringCellValue());
            tempPurchase.setCessPer(row.getCell(40).getStringCellValue());
            tempPurchase.setCessAmt(row.getCell(41).getStringCellValue());


            tempPurchase.setTotal(row.getCell(42).getStringCellValue());
            tempPurchase.setPost(row.getCell(43).getStringCellValue());

            long purchases = purchaseRepository.count();
            System.out.println("fetching repository " + purchases);
            try {
                purchaseRepository.save(tempPurchase);
            }catch(Exception e){
                System.out.println(e.getCause());
            }
            purchaseArrayList.add(tempPurchase);
        }


    }
