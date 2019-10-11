package org.egov.persistence.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.springframework.util.StringUtils.isEmpty;

import org.egov.common.contract.response.ResponseInfo;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class OtpResponse {
	private ResponseInfo responseInfo;
    private Otp otp;

    public String getOtpNumber() {
        return otp != null ? otp.getOtp() : null;
    }

    public boolean isOtpNumberAbsent() {
        return isEmpty(getOtpNumber());
    }
}


