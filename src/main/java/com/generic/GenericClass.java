package com.generic;

public class GenericClass<T,E,F> {
        private T t;
        private E e;
        private F f;
    GenericClass(T t,E e,F f){
            this.t = t;
            this.e = e;
            this.f = f;
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public F getF() {
            return f;
        }

        public void setF(F f) {
            this.f = f;
        }

        public T returnTinform(){
            return t;
        }

}
