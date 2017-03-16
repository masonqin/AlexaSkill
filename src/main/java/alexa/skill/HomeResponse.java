package alexa.skill;

import java.util.Random;

import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;


public class HomeResponse {
	
	SmartHome smartHome = new SmartHome();
	
	public SpeechletResponse getLightIntensityResponse() {
    	
		//TODO
		smartHome.getLightIntensity();
		
    	String speechText = "Your room light intensity is ";
    	Random random = new Random();
    	int lightIntensity = random.nextInt(100);
    	speechText += lightIntensity;

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("LightIntensity");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    	
    }
    
	public SpeechletResponse getColorLightResponse(String state) {
    	
		smartHome.setDeviceState("colorlight", state);
		
    	String speechText = "Your color light is " + state;

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("ColorLight");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    	
    }
    
	public SpeechletResponse getKettleResponse(String state) {
    	
		smartHome.setDeviceState("kettle", state);
		
    	String speechText = "Your kettle is " + state;

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("Kettle");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    	
    }

}
