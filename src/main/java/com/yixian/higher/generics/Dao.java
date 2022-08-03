package com.yixian.higher.generics;

import com.yixian.ILoggerAble;

import java.util.*;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description :
 * @create : 2022-07-24 23:11
 */
public class Dao <T> implements ILoggerAble {

    private final Map<String,T> data = new HashMap<>();

    public Dao() {
    }

    public void save(String id, T entity) {
        data.put(id,entity);
    }

    public T get(String id) {
        return data.get(id);
    }

    public void update(String id, T entity) {
        save(id,entity);
    }

    public Collection<T> list() {
        return data.values();
    }

    public void remove(String id) {
        data.remove(id);
    }

    public void printData() {
        Set<Map.Entry<String, T>> entries = data.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next = iterator.next();
            if (next == null) {
                continue;
            }
            StringBuffer sb = new StringBuffer();
            sb.append("key = ");
            sb.append(next.getKey());
            sb.append(", value = ");
            sb.append(next.getValue());
            LOGGER.info(sb.toString());
        }
    }
}
