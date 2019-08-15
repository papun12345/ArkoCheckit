package com.wipro.rule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.wipro.rtvs.Rtvs;
import com.wipro.rtvs.Scm;
import com.wipro.rule.Team;;

@Service
public class ServiceMongo {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
    ServiceMongo mongoService;
	
	@Autowired
	private TeamRepository teamRepository;
	
	
	
	public Rtvs updateRtvs()
	{
		//System.out.println("Nimisha");
		Rtvs rtvs=new Rtvs();
		Query query = new Query(Criteria.where("rigletName").is("EDN141"));
        rtvs = mongoTemplate.findOne(query, Rtvs.class);
        //System.out.println(rtvs.getAlm());
        return rtvs;
	}
	public Team getScmData()
	{
		Query query = Query.query(Criteria
                .where("achievements").elemMatch(Criteria.where("reward").exists(true)));
//.is(10)
		Update update = 
				new Update().pull("achievements", 
						new BasicDBObject());
//"reward", 10
		mongoTemplate.updateMulti(query, update, Team.class);

		/*ServiceMongo serviceMongo=new ServiceMongo();
		serviceMongo.updateRtvs();
		Scm scm=new Scm();
		System.out.println(scm.getCommitCount());*/
		return null;		
	}
	public Team updateScmReward()
	{
		System.out.println("updateScmReward");
		Team team=new Team();
		Query query = new Query(Criteria.where("name").is("EDN141"));
        team = mongoTemplate.findOne(query, Team.class);
       // System.out.println(team.getAchievements().toString());
        team.setPoints(0);
        mongoTemplate.save(team);
		return team;
	}
}
