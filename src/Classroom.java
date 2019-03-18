import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public int capacity;
    private Map <ClassroomEquipment, Integer> equipment;    // <Equipment : Quantity>


    public Classroom(int capacity) {
        this.capacity = capacity;
        this.equipment = new HashMap<>();
    }

    public Classroom(int capacity, Map<ClassroomEquipment, Integer> equipment) {
        this.capacity = capacity;
        this.equipment = equipment;
    }

    // Equipment manipulations

    public boolean addNewEquipment(ClassroomEquipment equipment_type, int quantity){
        if (this.equipment.containsKey(equipment_type)){
            return false;
        }
        this.equipment.put(equipment_type, quantity);
        return true;
    }

    public boolean updateEquipment(ClassroomEquipment equipment_type, int quantity){
        if (!this.equipment.containsKey(equipment_type)){
            return false;
        }
        this.equipment.put(equipment_type, quantity);
        return true;
    }

    public boolean removeEquipment(ClassroomEquipment equipment_type){
        if (this.equipment.containsKey(equipment_type)){
            return false;
        }
        this.equipment.remove(equipment_type);
        return true;
    }

    public Map<ClassroomEquipment, Integer> getEquipment() {
        return equipment;
    }

    public void setEquipment(Map<ClassroomEquipment, Integer> equipment) {
        this.equipment = equipment;
    }

    // Capacity manipulations

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}