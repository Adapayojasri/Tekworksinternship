/*The patient details should include his/her name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian's name, guardian’s address, guardian’s contact number. Assign a unique id to each patient admitted. 
Note: Validate user entered data. Such as 
Number of digits in age is 1 or 2 digits. 
Aadhar card number should contains 12 digits. 
Contact number should contain 10 digits only.*/
class AarogyaHospitalData
{
     String Patientname;
     int Patientid;
     int Patientage;
     char gender;
     int aadharcardnumber;
     String phonenumber;
     String city;
     String address;
     int dateofadmission;
     String guardiansname;
  String guardiansaddress;
  String guardianscontactnumber;
    public AarogyaHospitalData ( String Patientname,int Patientid,int Patientage,char gender,int aadharcardnumber,String phonenumber,String city, String address, int dateofadmission, String guardiansname,String guardiansaddress,String guardianscontactnumber)
    {
        this.Patientname = Patientname;
        this.Patientid= Patientid;
        this. Patientage= Patientage;
        this.gender=gender;
        this.aadharcardnumber=aadharcardnumber;
        this.phonenumber=phonenumber;
        this.city=city;
        this.address=address;
        this.dateofadmission=dateofadmission;
       this.guardiansname=guardiansname;
      this.guardiansaddress=guardiansaddress;
      this.guardianscontactnumber=guardianscontactnumber;    
    }
  public String getPatientname() {
		return Patientname;
	}
	public void setPatientname(String patientname) {
		Patientname = patientname;
	}
	public int getPatientid() {
		return Patientid;
	}
	public void setPatientid(int patientid) {
		Patientid = patientid;
	}
	public int getPatientage() {
		return Patientage;
	}
	public void setPatientage(int patientage) {
		Patientage = patientage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAadharcardnumber() {
		return aadharcardnumber;
	}
	public void setAadharcardnumber(int aadharcardnumber) {
		this.aadharcardnumber = aadharcardnumber;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDateofadmission() {
		return dateofadmission;
	}
	public void setDateofadmission(int dateofadmission) {
		this.dateofadmission = dateofadmission;
	}
	public String getGuardiansname() {
		return guardiansname;
	}
	public void setGuardiansname(String guardiansname) {
		this.guardiansname = guardiansname;
	}
	public String getGuardiansaddress() {
		return guardiansaddress;
	}
	public void setGuardiansaddress(String guardiansaddress) {
		this.guardiansaddress = guardiansaddress;
	}
	public String getGuardianscontactnumber() {
		return guardianscontactnumber;
	}
	public void setGuardianscontactnumber(String guardianscontactnumber) {
		this.guardianscontactnumber = guardianscontactnumber;
	}
  public String toString()
  {
    return "Patientname:"+getPatientname()+" "+"Patientage"+getPatientage()+" "+"gender"+" "+getGender()+" "+"Adhar number"+" "+getAadharcardnumber()+" "+"phone number"+getPhonenumber()+""+"city"+getCity()+" "+"address"+" "+getAddress()+""+"dateofadmission"+getDateofadmission()+""+"guardiansname"+getGuardiansaddress()+""+"guardiansaddress"+getGuardiansaddress()+""+"guardianscontactnumber"+getGuardianscontactnumber();
  }
}
	