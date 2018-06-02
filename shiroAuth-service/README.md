参照这个实现
https://www.cnblogs.com/ll409546297/p/7815409.html

注意：
1：在springBoot集成JPA中，多表关联尽量不要使用“多对多”关联，使用“一对多”即可，为了提高效率，避免对第三张表进行维护
2：可以使用jpql来些本地sql复杂查询
3：不要使用in,使用exists代替in的使用
例如：
查询用户的角色
SELECT r.* FROM role r WHERE EXISTS (SELECT 0 FROM USER u WHERE u.id=r.user_id AND u.id = 1)

查询用户的权限
SELECT p.* FROM permission p WHERE EXISTS (SELECT 0 FROM role r WHERE p.role_id = r.id AND r.user_id = 1)