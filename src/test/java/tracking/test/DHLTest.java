package tracking.test;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import tracking.dhl.KnownTrackingRequest;
import tracking.dhl.LanguageCode;
import tracking.dhl.LevelOfDetails;
import tracking.dhl.Request;
import tracking.dhl.ServiceHeader;
import tracking.dhl.TrackingResponse;
import tracking.utils.XmlHttpUtil;


public class DHLTest {

	public static void main(String[] args) {
		KnownTrackingRequest knownTrackingRequest = new KnownTrackingRequest();
		Request request = new Request();
		ServiceHeader serviceHeader = new ServiceHeader();
		serviceHeader.setMessageReference("1234567890123456789012345678");
		GregorianCalendar gcal = new GregorianCalendar();
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		serviceHeader.setMessageTime(xgcal);
		serviceHeader.setSiteID("XXX");//user
		serviceHeader.setPassword("XXX");//password
		request.setServiceHeader(serviceHeader);
		knownTrackingRequest.setRequest(request);
		knownTrackingRequest.setLanguageCode(LanguageCode.EN);
		knownTrackingRequest.setLevelOfDetails(LevelOfDetails.LAST_CHECK_POINT_ONLY);
		knownTrackingRequest.getAWBNumber().add("XXX");//track number
		
		TrackingResponse s = XmlHttpUtil.post(knownTrackingRequest, "https://xmlpitest-ea.dhl.com/XMLShippingServlet", TrackingResponse.class);
		
		System.out.println(s.getAWBInfo().get(0).getStatus().getActionStatus());
		System.out.println(s.getAWBInfo().get(0).getShipmentInfo().getShipmentEvent().get(0).getServiceArea().getDescription());
	}
}
