package com.mainapp.entity;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection="mdb_mtm_sport")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class SportEntity {
	
	@Id
	@NonNull
	private Integer sid;
	@NonNull
	private String spname;
	@NonNull
	private String spType;
	@NonNull
	private String[] kitItems;
	private Set<PlayerEntity> playerInfo;
	private Map<String,MedalEntity> medalInfo;
	@Override
	public String toString() {
		return "SportEntity [sid=" + sid + ", spname=" + spname + ", spType=" + spType + ", kitItems="
				+ Arrays.toString(kitItems) + "]";
	}
}
