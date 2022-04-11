## sql需要重点掌握的：
去重 distinct
限制 limit
重命名 as
排序 order asc desc
条件 where  
计算 max avg count
聚合结果作为筛选条件只能用 having 
两表连接    inner join     on


## 具体需要看的题目
SQL3 distinct
SQL37 age asc, gpa desc 双重条件排序
SQL8 where age >= 20 and age <= 23;
SQL10 where age is not null;
SQL12 where university ="北京大学" or gpa >3.7
SQL13 where university in ('北京大学','复旦大学','山东大学');
SQL14 where gpa > 3.5 and university = '山东大学' or
      gpa > 3.8 and university = '复旦大学';
SQL15 where university like '%北京%'; (模糊查询)
SQL16 select max(gpa) from user_profile; d
SQL17 select count(gender) ,avg(gpa) as avg_gpa from user_profile
      where gender = 'male';
SQL18 select gender,university,
      count(id) as user_num,
      avg(active_days_within_30) as avg_active_day,
      avg(question_cnt) as avg_question_cnt
      from user_profile 
      group by gender,university;    (查询列结尾是没有,的)
SQL19 select university,
      avg(question_cnt) as avg_question_cnt,
      avg(answer_cnt) as avg_answer_cnt
      from user_profile
      group by university
      having avg_question_cnt < 5 or avg_answer_cnt < 20; (聚合结果的使用having)


涉及多表查询
SQL21 select t1.device_id, t2.question_id, t2.result
      from user_profile as t1
      inner join question_practice_detail as t2
      on t1.device_id = t2.device_id
      where t1.university = '浙江大学'
      order by t2.question_id;
      
SQL22 select t1.university,
      count(t2.question_id)/count(distinct t2.device_id) as avg_answer_cnt
      from user_profile as t1
      join question_practice_detail as t2
      on t1.device_id = t2.device_id
      group by university;
      
SQL23 select t2.university,t3.difficult_level,
      count(t1.question_id)/count(distinct t1.device_id) as avg_answer_cnt
      from question_practice_detail as t1
      left join user_profile as t2
      on t1.device_id = t2.device_id
      left join question_detail as t3
      on t1.question_id = t3.question_id
      group by t3.difficult_level, t2.university;
     
     