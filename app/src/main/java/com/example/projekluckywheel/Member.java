package com.example.projekluckywheel;

public class Member {
    int _id;
    String _slot;
    String _nama;
    String _lunas;

    public Member() {
    }

    public Member(String _slot, String _nama, String _lunas){
        this. _slot= _slot;
        this. _nama = _nama;
        this. _lunas= _lunas;
        }

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        public String get_slot() {
            return _slot;
        }

        public void set_slot(String _slot) {
            this._slot = _slot;
        }

        public String get_nama() {
            return _nama;
        }

        public void set_nama(String _nama) {
            this._nama = _nama;
        }

        public String get_lunas() {
            return _lunas;
        }

        public void set_lunas(String _lunas) {
            this._lunas = _lunas;
        }


    /*public byte[] get_slot() {
    }

    public byte[] get_nama() {
    }

    public byte[] get_lunas() {
    }*/

    /*public void set_id(int parseInt) {
    }

    public void set_slot(String string) {
    }

    public void set_nama(String string) {
    }

    public void set_lunas(String string) {
    }*/
}
