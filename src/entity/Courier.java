package entity;

public class Courier {
   private int idCourier; 
   private String courierName;
   private String courierAddress;

   public Courier() {
   }

   public Courier(int idCourier, String courierName) {
      this.idCourier = idCourier;
      this.courierName = courierName;
   }

   public int getIdCourier() {
      return idCourier;
   }

   public void setIdCourier(int idCourier) {
      this.idCourier = idCourier;
   }

   public String getCourierName() {
      return courierName;
   }

   public void setCourierName(String courierName) {
      this.courierName = courierName;
   }

   public String getCourierAddress() {
      return courierAddress;
   }

   public void setCourierAddress(String courierAddress) {
      this.courierAddress = courierAddress;
   }

   
}
