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


       logger.info("HEY I'M THE LOGGER!!!");
        // here I'm testing the exception handling with resources
      /*  try (MedicalRecordReader recordReader = new MedicalRecordReader("./medicalRecords.txt")){
            String medicalRecord = recordReader.readMedicalRecord();
            System.out.println(medicalRecord);
        }catch (IOException e){
            System.err.println("error during medical record processing" + e.getMessage());
        }

*/

        //here I'm testing the exception handling
        Patient p1 = new Patient("carlos","perez","chhoc",null);
        Nurse claudia = new Nurse("claudia","cardozo",4,32,"surgery");
        claudia.obtainPatientSymptoms(p1);

        Surgery surgery = new Surgery(null,"john",5);
        Doctor carlos = new Doctor("carlos","cabrera",4,33,"surgeon");
        carlos.getSurgeryDepartmentName(surgery);

    }}