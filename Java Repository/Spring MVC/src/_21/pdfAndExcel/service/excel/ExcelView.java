package _21.pdfAndExcel.service.excel;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import _21.pdfAndExcel.model.Person;

@SuppressWarnings("deprecation")
public class ExcelView extends AbstractExcelView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<Person> personList = (List<Person>) model.get("persons");

		HSSFSheet sheet = workbook.createSheet("Persons");
		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.createCell(1).setCellValue("Name");
		header.createCell(2).setCellValue("Surname");
		header.createCell(3).setCellValue("BirthYear");

		int rowNum = 1;
		for (Person person : personList) {
			HSSFRow row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(person.getId());
			row.createCell(1).setCellValue(person.getName());
			row.createCell(2).setCellValue(person.getSurname());
			row.createCell(3).setCellValue(person.getBirthYear());

		}

	}
}
