abstract class lugar implements interlugar{
	private String name;
	private String location;
    private String schedule;
    private String numtel;
    private int rating = 0;
	private int numperrating = 0;
	private int sumarating = 0;

	lugar (String nam, String locat, String sch, String numtelk, int numperratin, int sumaratin){
		this.name = nam;
		this.location = locat;
		this.schedule = sch;
		this.numtel = numtelk;
		this.sumarating = sumaratin;
		this.numperrating = numperratin;
		if(sumaratin == 0 || numperratin == 0){
			this.rating = 0;
		}
		else{
		this.rating = sumarating/numperrating;
		}

	}

	@Override
	public String agregado() {
		// TODO Auto-generated method stub
		return "";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public lugar(){
    }

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getNumtel() {
		return numtel;
	}

	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}


	public int getNumperrating() {
		return numperrating;
	}


	public void setNumperrating(int numperrating) {
		this.numperrating = numperrating;
	}


	public int getSumarating() {
		return sumarating;
	}


	public void setSumarating(int sumarating) {
		this.sumarating = sumarating;
	}

    
    

}
