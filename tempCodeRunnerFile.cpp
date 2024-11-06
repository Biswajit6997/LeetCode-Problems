// TCS MockVita 2

#include <bits/stdc++.h>
using namespace std;
bool v(const string& s) 
{
    for(char c : s) 
    {
        if(c != '0' && c != '1') 
        {
            return false;
        }
    }
    return true;
}

int c(const string& s, int a, int b) 
{
    int r = 0;
    for(string::size_type i = 0; i < s.length() - 1; i++)
    {
        if(s[i] == '0' && s[i + 1] == '1') r += a;
        if(s[i] == '1' && s[i + 1] == '0') r += b;
    }
    return r;
}
int h(const string& s1, const string& s2)
{
    int d = 0;
    for(string::size_type i = 0; i < s1.length(); i++) 
    {
        if(s1[i] != s2[i]) d++;
    }
    return d;
}
string o(const string& s, int a, int b) 
{
    int n = s.length();
    int o = 0;
    for(char c : s) 
    {
        if(c == '1') o++;
    }
    string bstr = s;
    int mc = c(s, a, b);
    int mh = 0;
    
    if(o == 0 || o == n) 
    {
        return s;
    }
    string a1(o, '1');
    a1 += string(n - o, '0');
    string a2(n - o, '0');
    a2 += string(o, '1');
    int c1 = c(a1, a, b);
    int c2 = c(a2, a, b);
    int h1 = h(s, a1);
    int h2 = h(s, a2);
    if(c1 < mc || (c1 == mc && h1 < mh))
    {
        bstr = a1;
        mc = c1;
        mh = h1;
    }
    
    if(c2 < mc || (c2 == mc && h2 < mh))
    {
        bstr = a2;
        mc = c2;
        mh = h2;
    }
    return bstr;
}
int main() 
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while(t--)
    {
        string s;
        int a, b;
        cin >> s >> a >> b;
        if(!v(s)) 
        {
            cout << "INVALID\n";
            continue;
        }
        string opt = o(s, a, b);
        cout << h(s, opt) << "\n";
        cout << "\n";
    }
    return 0;
}