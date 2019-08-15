package com.wipro.rule;

import java.io.IOException;
import java.util.List;

import org.kie.api.command.KieCommands;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.rtvs.Rtvs;
import com.wipro.rtvs.Scm;


@RestController
public class RuleEngineController {
	@Autowired
	private KieSession session;
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
    MongoTemplate mongoTemplate;
	
	@Autowired
    ServiceMongo mongoService;
	
	@PostMapping("/checkrule")
	public Rtvs ruleCheck(@RequestBody Rules rule) throws IOException {
		//session.startProcess("com.wipro.rule.DroolConfig");
		mongoService.getScmData();
		KieSession session=new DroolConfig().getKieSession();
		Team p=mongoService.updateScmReward();
		Rtvs x=mongoService.updateRtvs();
		Achievements achievment=new Achievements();
		List<Scm> y=x.getScm();
		session.insert(x);
		session.insert(achievment);
		for (Scm scm : y) {
			session.insert(scm);
		}
		session.insert(p);
		p.setAchievements(achievment);
		session.fireAllRules();
		session.dispose();
		mongoTemplate.save(p);
		return x;
	}
	@RequestMapping(value = "/team", method = RequestMethod.GET)
	public List<Team> getAllTeam() {
		System.out.println("Nimisha");
	  return teamRepository.findAll();
	}
	@RequestMapping(value = "/Oneteam", method = RequestMethod.GET)
	public Team getOneTeam() {
		System.out.println("Nimisha");
		Team team=new Team();
		Query query = new Query(Criteria.where("name").is("EDN141"));
        team = mongoTemplate.findOne(query, Team.class);
        team.setName("subha");
        mongoTemplate.save(team);
		return team;
	}

}
