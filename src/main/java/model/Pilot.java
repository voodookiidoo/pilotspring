package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


@Entity
@Table(name = "pilots")
@Getter
@Setter
@Accessors(chain = true)
public class Pilot {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fullname")
	private String fullname;
	@ManyToOne
	@JoinColumn(name = "titan_id", referencedColumnName = "id")
	private Titan titan;
	@ManyToOne
	@JoinColumn(name = "weapon_id", referencedColumnName = "id")
	private PilotWeapon weapon;
	@Column(name = "tactic_ability")
	@Enumerated(EnumType.STRING)
	private PilotTactic tactic;


	public static enum PilotTactic {
		shift, stim, invis, holo, hook, pulse, shield
	}
}
