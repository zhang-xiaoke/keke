package com.nhy.person;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/5/18 17:44
 * @version: v1.0
 * @modified By:
 */
public class Person {

        private String p_Age;
        private String p_Sex;
        private String id;
        private String p_Name;


        public Person() {

        }

        public Person(String p_Age, String p_Sex, String id, String p_Name) {
            this.p_Age = p_Age;
            this.p_Sex = p_Sex;
            this.id = id;
            this.p_Name = p_Name;
        }

        public String getP_Age() {
            return p_Age;
        }

        public void setP_Age(String p_Age) {
            this.p_Age = p_Age;
        }

        public String getP_Sex() {
            return p_Sex;
        }

        public void setP_Sex(String p_Sex) {
            this.p_Sex = p_Sex;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getP_Name() {
            return p_Name;
        }

        public void setP_Name(String p_Name) {
            this.p_Name = p_Name;
        }
    }

