#include<iostream>
#include <string>
#include <cstdio>
using namespace std;

class Node{
    public:
        int data;
        Node* next;

    Node()
    {
        data = 0;
        next = NULL;
    }

    Node(int nodeData){
        this->data = nodeData;
        this->next = NULL;
    }
    
};