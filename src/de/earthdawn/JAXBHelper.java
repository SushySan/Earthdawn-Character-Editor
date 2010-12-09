package de.earthdawn;

import javax.xml.bind.JAXBElement;

import de.earthdawn.data.APPEARANCEType;
import de.earthdawn.data.ATTRIBUTEType;
import de.earthdawn.data.CARRYINGType;
import de.earthdawn.data.DEFENSEType;
import de.earthdawn.data.EDCHARAKTER;
import de.earthdawn.data.HEALTHType;

/**
 * Hilfsklasse zur einfacheren Verarbeitung des JAXB-Baumes
 *
 * @author egon_mueller
 */
public class JAXBHelper {

	public static final String DEFENSE = "DEFENSE";
	
	public static final String APPEARANCE = "APPEARANCE";
	
	public static final String CARRYING = "CARRYING";
	
	public static final String HEALTH = "HEALTH";
	
	public static final String RACEABILITES = "RACEABILITES";
	
	public static final String ATTRIBUTE = "ATTRIBUTE";

	public static APPEARANCEType getAppearance(EDCHARAKTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (APPEARANCE.equals(element.getName().getLocalPart())) {
				return (APPEARANCEType) element.getValue();
			}
		}

		// Not found
		return null;
	}

	public static DEFENSEType getDefence(EDCHARAKTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (DEFENSE.equals(element.getName().getLocalPart())) {
				return (DEFENSEType) element.getValue();
			}
		}

		// Not found
		return null;
	}

	public static CARRYINGType getCarrying(EDCHARAKTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (CARRYING.equals(element.getName().getLocalPart())) {
				return (CARRYINGType) element.getValue();
			}
		}
		// Not found
		return null;
	}
	public static HEALTHType getHealth(EDCHARAKTER charakter) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (HEALTH.equals(element.getName().getLocalPart())) {
				return (HEALTHType) element.getValue();
			}
		}
		// Not found
		return null;
	}

	public static ATTRIBUTEType getAttribute(EDCHARAKTER charakter, String id) {
		for (JAXBElement<?> element : charakter.getATTRIBUTEOrDEFENSEOrHEALTH()) {
			if (ATTRIBUTE.equals(element.getName().getLocalPart())) {

				ATTRIBUTEType attribute = (ATTRIBUTEType) element.getValue();
				if (attribute.getName().value().equals(id)) {
					return attribute;
				}
			}
		}

		// Not found
		return null;
	}
}