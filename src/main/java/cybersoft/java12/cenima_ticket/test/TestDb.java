package cybersoft.java12.cenima_ticket.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_db")
public class TestDb {
	@Id
	@GeneratedValue
	private Long id;
}
