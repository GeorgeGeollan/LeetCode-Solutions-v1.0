class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();

        for(String email : emails)
        {
            int idx = email.indexOf("@");
            String local = email.substring(0, idx);
            String rest = email.substring(idx);

            if(local.contains("+"))
                local = local.substring(0, local.indexOf("+"));

            local = local.replaceAll("\\.", "");
            set.add(local + rest);
        }

        return set.size();
    }
}
