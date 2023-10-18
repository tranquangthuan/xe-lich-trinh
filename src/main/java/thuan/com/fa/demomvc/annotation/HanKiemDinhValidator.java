package thuan.com.fa.demomvc.annotation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HanKiemDinhValidator implements ConstraintValidator<HanKiemDinh, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}

		return value.isAfter(LocalDate.now().plusDays(30));
	}

	@Override
	public void initialize(HanKiemDinh constraintAnnotation) {
	}

}
