package model;

public class Validations {
	
	public DocType validDocType(String type){
		String typeDoc = type.toLowerCase();
		DocType result = null;
		if (typeDoc.equals("dni")) {
			result = DocType.DNI;
		} else {
			if (typeDoc.equals("passport")) {
				result = DocType.PASSPORT;
			} else {
				if (typeDoc.equals("cardid")) {
					result = DocType.CARDID;
				} else {
					if (typeDoc.equals("greencard")) {
						result = DocType.GREENCARD;
					} 
				}
			}
		}
		return result;
	}
	
	public PaymenthMethod validPaymenthMethod(String type){
		String typePayMethod = type.toLowerCase();
		PaymenthMethod result = null;
		if (typePayMethod.equals("tc")) {
			result = PaymenthMethod.TC;
		} else {
			if (typePayMethod.equals("td")) {
				result = PaymenthMethod.TD;
			} else {
				if (typePayMethod.equals("cash")) {
					result = PaymenthMethod.CASH;
				} else {
					if (typePayMethod.equals("millas")) {
						result = PaymenthMethod.MILLAS;
					} 
				}
			}
		}
		return result;
	}
	
	public PiloteType validPiloteType(String type){
		String typePilote = type.toLowerCase();
		PiloteType result = null;
		if (typePilote.equals("pilote")) {
			result = PiloteType.PILOTE;
		} else {
			if (typePilote.equals("copilote")) {
				result = PiloteType.COPILOTE;
			}  
		}
		return result;
	}
	
	public AirplaneType validAirplaneType(String type){
		String typeAirplane = type.toLowerCase();
		AirplaneType  result = null;
		if (typeAirplane.equals("boeing")) {
			result = AirplaneType.BOEING;
		} else {
			if (typeAirplane.equals("airbuss")) {
				result = AirplaneType.AIRBUSS;
			} else {
				if (typeAirplane.equals("a380")) {
					result = AirplaneType.A380;
				}  
			}
		}
		return result;
	}
	
	
}
