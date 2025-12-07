package com.akkkkltl.mall.generator.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import com.akkkkltl.mall.generator.config.MongoCondition;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import jakarta.annotation.PostConstruct;

@Component
@Conditional(MongoCondition.class)
public class MongoDBCollectionFactory {

    private static final String TABLE_NAME_KEY = "tableName";
    private static final String LIMIT_KEY = "limit";
    private static final String OFFSET_KEY = "offset";

    private static MongoDatabase mongoDatabase;

    // 此处是为了兼容mongo相关内容和关系型数据库的静态耦合所导致的问题

    @Autowired
    private MongoDatabase database;
    @PostConstruct
    public void initMongoDatebase() {
        mongoDatabase = database;
    }

    /**
     * 通过表名获得查询对象
     * @param collectionName 集合名称
     * @return 连接查询对象
     */
    public MongoCollection<Document> getCollection(String collectionName) {
        return mongoDatabase.getCollection(collectionName);
    }

    /**
     * 获取集合名称列表
     * @param map 查询参数
     * @return 集合名称列表
     */
    public static List<String> getCollectionNames(Map<String, Object> map) {
        int limit = Integer.valueOf(map.get(LIMIT_KEY).toString());
        int skip = Integer.valueOf(map.get(OFFSET_KEY).toString());
        List<String> names;
        if (map.containsKey(TABLE_NAME_KEY)) {
            names = getCollectionNames(map.get(TABLE_NAME_KEY).toString());
        } else {
            names = getCollectionNames();
        }
        return names.stream().skip(skip).limit(limit).collect(Collectors.toList());
    }

    /**
     * 获取集合总数
     * @param map 查询参数
     * @return 集合总数
     */
    public static int getCollectionTotal(Map<String, Object> map) {
        if (map.containsKey(TABLE_NAME_KEY)) {
            return getCollectionNames(map.get(TABLE_NAME_KEY).toString()).size();
        }
        return getCollectionNames().size();
    }

    private static List<String> getCollectionNames() {
        MongoIterable<String> names = mongoDatabase.listCollectionNames();
        List<String> result = new ArrayList<>();
        for (String name : names) {
            result.add(name);
        }
        return result;
    }

    private static List<String> getCollectionNames(String likeName) {
        return getCollectionNames()
                .stream()
                .filter((name) -> name.contains(likeName))
                .collect(Collectors.toList());
    }

}
