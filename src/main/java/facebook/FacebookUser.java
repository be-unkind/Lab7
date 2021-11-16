package facebook;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;
}
