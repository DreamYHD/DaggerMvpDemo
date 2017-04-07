package com.androidlab.daggermvpdemo.model.bean;

import java.util.List;

/**
 * Created by Haodong on 2017/4/5.
 */

public class Gank {

    /**
     * error : false
     * results : [{"_id":"58e3198e421aa90d6bc75ab4","createdAt":"2017-04-04T11:57:02.111Z","desc":"4-4","publishedAt":"2017-04-05T11:50:18.748Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-04-17438270_1418311001574160_8728796670000627712_n.jpg","used":true,"who":"dmj"},{"_id":"58ddcb2b421aa969f51a911e","createdAt":"2017-03-31T11:21:15.303Z","desc":"3-31","publishedAt":"2017-03-31T11:26:54.330Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-31-17662615_1819763634937161_2829588299293655040_n.jpg","used":true,"who":"dmj"},{"_id":"58dc5645421aa969fd8a3dea","createdAt":"2017-03-30T08:50:13.178Z","desc":"3-30","publishedAt":"2017-03-30T11:46:55.192Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-30-17265582_1877445642507654_3057988544061505536_n.jpg","used":true,"who":"dmj"},{"_id":"58db2305421aa969fb0fbed1","createdAt":"2017-03-29T10:59:17.522Z","desc":"3-29","publishedAt":"2017-03-29T11:48:49.343Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-29-17267498_392021674501739_8632065627013513216_n.jpg","used":true,"who":"dmj"},{"_id":"58d9b4e0421aa969f75cedeb","createdAt":"2017-03-28T08:57:04.208Z","desc":"3-28","publishedAt":"2017-03-28T12:05:55.791Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-28-17494350_115579865647756_2448160714821468160_n.jpg","used":true,"who":"dmj"},{"_id":"58d7dd53421aa93abb7d4e5a","createdAt":"2017-03-26T23:25:07.975Z","desc":"3-26","publishedAt":"2017-03-27T11:48:52.828Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-26-17495078_643307445877569_4485136026821459968_n.jpg","used":true,"who":"dmj"},{"_id":"58d49bad421aa93abf5d3b76","createdAt":"2017-03-24T12:08:13.590Z","desc":"3-24","publishedAt":"2017-03-24T12:12:34.753Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-24-17438359_1470934682925012_1066984844010979328_n.jpg","used":true,"who":"dmj"},{"_id":"58d33d54421aa95810795cc1","createdAt":"2017-03-23T11:13:24.719Z","desc":"3-23","publishedAt":"2017-03-23T11:44:38.634Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-23-17265820_645330569008169_4543676027339014144_n.jpg","used":true,"who":"dmj"},{"_id":"58d1e74e421aa90efc4fb70a","createdAt":"2017-03-22T10:54:06.864Z","desc":"3-22","publishedAt":"2017-03-22T11:47:09.555Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-22-17332868_1929305090624552_8918542166154805248_n.jpg","used":true,"who":"dmj"},{"_id":"58d08621421aa95810795ca1","createdAt":"2017-03-21T09:47:13.3Z","desc":"3-21","publishedAt":"2017-03-21T12:19:46.895Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/2017-03-21-17268102_763630507137257_3620762734536163328_n%20-1-.jpg","used":true,"who":"dmj"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 58e3198e421aa90d6bc75ab4
         * createdAt : 2017-04-04T11:57:02.111Z
         * desc : 4-4
         * publishedAt : 2017-04-05T11:50:18.748Z
         * source : chrome
         * type : 福利
         * url : http://7xi8d6.com1.z0.glb.clouddn.com/2017-04-04-17438270_1418311001574160_8728796670000627712_n.jpg
         * used : true
         * who : dmj
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
