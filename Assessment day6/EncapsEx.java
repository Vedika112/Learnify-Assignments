
public class EncapsEx {
private int vehicleNo;
private String vehicleName,vehicleType;
public int getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(int vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public static void main(String[] args) {
	EncapsEx e=new EncapsEx();
	e.setVehicleNo(1432);
	e.setVehicleName("abc");
	e.setVehicleType("two-wheeler");
	System.out.println(e.getVehicleName());
	System.out.println(e.getVehicleNo());
	System.out.println(e.getVehicleType());}}
