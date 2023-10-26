package org.galapagos.travel.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Travel {
	private int no;
	private String region;
	private String title;
	private String address;
	private String phone;
	private String description;
}
