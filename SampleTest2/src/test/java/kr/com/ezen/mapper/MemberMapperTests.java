package kr.com.ezen.mapper;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.com.ezen.dto.MemberVO;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testInsert() {
			MemberVO vo = MemberVO.builder()
					.id(15)
					.name("딸기")
					.phone("010-789-1234")
					.address("경기도 평택시")
					.build();
			log.info(mapper.insertMember(vo));
		}
	@Test
	public void testUpdate() {
		MemberVO vo = MemberVO.builder()
				.id(17)
				.name("딸기")
				.phone("010-1111-1122")
				.address("경기도 안성시")
				.build();
		log.info(mapper.updateMember(vo));
	}
	@Test
	public void testDelete() {
		log.info(mapper.deleteMember(1));
	}
	
	@Test
	public void testSelectOne() {
		MemberVO vo = mapper.selectOneMember(2);
		log.info(vo);
	}
	@Test
	public void testSelectList() {
		mapper.selectAllmember().forEach(vo -> log.info(vo));
		
	}
	
}
