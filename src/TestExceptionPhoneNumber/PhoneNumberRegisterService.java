package TestExceptionPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumberRegisterService {
    List<Object> registeredPhoneNumbers = Arrays.asList("+1-111-111-11-11", "+1-111-111-11-12", "+1-111-111-11-13", "+1-111-111-11-14");

    public void validatePhone(String phoneNumber) throws PhoneNumberIsExistException {
        if(registeredPhoneNumbers.contains(phoneNumber)){
            throw new PhoneNumberIsExistException("Номер используется другим клиентом!");
        }
    }


}
