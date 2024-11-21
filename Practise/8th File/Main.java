import java.util.List;

@SuppressWarnings("unused")
class Citizen {
    private String name;
    private String address;
    private String phone;

    public Citizen(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

@SuppressWarnings("unused")
class Pothole {
    private int id;
    private String start;
    private String size;
    private String location;
    private String division;
    private String person;

    public Pothole(int id, String start, String size, String location, String division, String person) {
        this.id = id;
        this.start = start;
        this.size = size;
        this.location = location;
        this.division = division;
        this.person = person;
    }

    public void reportPothole() {
        System.out.println("Pothole report generated.");
    }

    public void listPotholes() {
        System.out.println("Listing potholes.");
    }
}

@SuppressWarnings("unused")
class DamageFile {
    private int potholeId;
    private String damageType;
    private String damageDetails;
    private String date;
    private String amount;

    public DamageFile(int potholeId, String damageType, String damageDetails, String date, String amount) {
        this.potholeId = potholeId;
        this.damageType = damageType;
        this.damageDetails = damageDetails;
        this.date = date;
        this.amount = amount;
    }

    public void logDamage() {
        System.out.println("Damage logged.");
    }
}

@SuppressWarnings("unused")
class WorkOrder {
    private int workOrderId;
    private String patrolId;
    private String crewId;
    private String equipment;
    private String status;

    public WorkOrder(int workOrderId, String patrolId, String crewId, String equipment, String status) {
        this.workOrderId = workOrderId;
        this.patrolId = patrolId;
        this.crewId = crewId;
        this.equipment = equipment;
        this.status = status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Work order status updated to: " + status);
    }

    public void assignCrew() {
        System.out.println("Crew assigned to work order.");
    }
}

@SuppressWarnings("unused")
class PotholeNumber {
    private String maintenanceName;
    private String lastWeekData;
    private String damageFile;
    private String taskType;

    public PotholeNumber(String maintenanceName, String lastWeekData, String damageFile, String taskType) {
        this.maintenanceName = maintenanceName;
        this.lastWeekData = lastWeekData;
        this.damageFile = damageFile;
        this.taskType = taskType;
    }

    public void displayLastWeek() {
        System.out.println("Displaying last week's data: " + lastWeekData);
    }

    public void logDamage() {
        System.out.println("Logging damage.");
    }
}

class Repair {
    private String crewId;
    private String crewSize;
    private String equipment;
    private String repairStatus;

    public Repair(String crewId, String crewSize, String equipment, String repairStatus) {
        this.crewId = crewId;
        this.crewSize = crewSize;
        this.equipment = equipment;
        this.repairStatus = repairStatus;
    }

    public void startRepair() {
        System.out.println("Repair started.");
    }

    public void completeRepair() {
        System.out.println("Repair completed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("John Doe", "123 Main St", "1234567890");
        Pothole pothole = new Pothole(1, "StartPoint", "Large", "City", "DivisionA", "PersonA");
        DamageFile damageFile = new DamageFile(1, "Crack", "Large crack in the road", "2024-11-21", "5000");
        WorkOrder workOrder = new WorkOrder(1, "Patrol1", "CrewA", "Jackhammer", "Assigned");
        PotholeNumber PotholeNumber = new PotholeNumber("Road Maintenance", "Last week repairs were done", "File123", "Repair");
        Repair repair = new Repair("CrewA", "5", "Heavy Machinery", "In Progress");

        pothole.reportPothole();
        damageFile.logDamage();
        workOrder.updateStatus("In Progress");
        PotholeNumber.displayLastWeek();
        repair.startRepair();
        repair.completeRepair();
    }
}