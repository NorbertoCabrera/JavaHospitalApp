package Classes;

import CustomLinkList.CustomLinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Hospital{
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
   private static final Logger logger = LogManager.getLogger(Hospital.class);

    public static void main(String[] args) {


      // logger.info("HEY I'M THE LOGGER!!!");
        // here I'm testing the exception handling with resources
      /*  try (Classes.MedicalRecordReader recordReader = new Classes.MedicalRecordReader("./medicalRecords.txt")){
            String medicalRecord = recordReader.readMedicalRecord();
            System.out.println(medicalRecord);
        }catch (IOException e){
            System.err.println("error during medical record processing" + e.getMessage());
        }

*/

        //here I'm testing the exception handling
        Patient p1 = new Patient("carlos","perez","chhoc",null);
        Nurse claudia = new Nurse("claudia","cardozo",4,32,"surgery");
       // claudia.obtainPatientSymptoms(p1);

        Surgery surgery = new Surgery("surgery","john",5);
        Doctor carlos = new Doctor("carlos","cabrera",4,33,"surgeon");
       // carlos.getSurgeryDepartmentName(surgery);

        Administration Admin = new Administration();

        Admin.setEmployeePayment(carlos);
        Admin.setEmployeePayment(claudia);

        Pharmacy pharmacy = new Pharmacy("pharmacy","charles douglas",455);

        Admin.setDepartments(surgery);
        Admin.setDepartments(pharmacy);
        logger.info("lista de departamentos: "+ Admin.getDepartments());

        CustomLinkedList<Integer> intList = new CustomLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Print the integer linked list
        System.out.print("Integer List: ");
        intList.printList();

    }}