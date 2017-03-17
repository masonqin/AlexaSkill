package alexa.skill;

public class SmartHome {
	
	public int getLightIntensity(){
		int intensity = 0;
		
		String url = "http://mason.applinzi.com/alexa";
		String parameter = "device=lightintensity&command=get";

		String s=HttpRequest.sendGet(url, parameter);
        System.out.println(s);
        
        return intensity;
    }
	
	public void setDeviceState(String device, String command){
		
		String url = "http://mason.applinzi.com/alexa";
		String parameter = "device=" + device + "&command=" + command;

		String s=HttpRequest.sendGet(url, parameter);
        System.out.println(s);
	}

}
