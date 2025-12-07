package com.akkkkltl.mall.generator.entity.mongo;

import java.util.List;
import java.util.Map;

import com.akkkkltl.mall.generator.entity.TableEntity;

public class MongoGeneratorEntity {
    /***表信息**/
    private Map<String, String> tableInfo;
    /***主类的列名信息**/
    private List<Map<String, String>> columns;

    public TableEntity toTableEntity() {
        TableEntity tableEntity = new TableEntity();
        Map<String, String> tableInfo = this.tableInfo;
        tableEntity.setTableName(tableInfo.get("tableName"));
        tableEntity.setComments("");
        return tableEntity;
    }

    public Map<String, String> getTableInfo() {
        return tableInfo;
    }

    public MongoGeneratorEntity setTableInfo(Map<String, String> tableInfo) {
        this.tableInfo = tableInfo;
        return this;
    }

    public List<Map<String, String>> getColumns() {
        return columns;
    }

    public MongoGeneratorEntity setColumns(List<Map<String, String>> columns) {
        this.columns = columns;
        return this;
    }
}
