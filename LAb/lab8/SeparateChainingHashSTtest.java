class SeparateChainingHashSTtest{
	public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        assert(st.isEmpty()==true);
        st.put("Galey",1);
        st.put("Wangmo",2);
        st.put("Galey",4);
        st.put("Dorji",5);
        st.put("Lhamo",7);
        st.put("Pema",8);
        st.delete("Pema");
        assert(st.isEmpty()==false);
        assert(st.contains("Galey"));
        System.out.println(st.get("Sonam"));
        System.out.println(st.size());
        System.out.println(st.keys());
    }
}
