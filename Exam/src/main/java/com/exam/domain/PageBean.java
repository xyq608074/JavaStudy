package com.exam.domain;

import java.util.List;

public class PageBean<T> {
    private int currentPage;//当前页
    private int pageSize;//每页显示数据条数
    private int total;//总记录数字

    private int totalPage;//总页数

    private List<T> list;//每页显示数据放到list集合中

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", totalPage=" + totalPage +
                ", list=" + list +
                '}';
    }

    //    //分页显示页数,如 1,2,3,4,5 页  start就是1 end就是5
//    private int start;
//    private int end;

//    //通过currentPage,pageSize,total计算出totalPage和startIndex
//    public PageBean(int currentPage,int pageSize,int total){
//        this.currentPage=currentPage;
//        this.pageSize=pageSize;
//        this.total=total;
//
//        //总页数
//        if (total%pageSize==0){
//            this.totalPage=total/pageSize;
//        }else{
//            this.totalPage=total/pageSize+1;
//        }
//
//
//        //开始索引
//        this.startIndex = (currentPage-1)*pageSize ;
//        //显示5页，这里自己可以设置，想显示几页就自己通过下面算法修改
//        this.start = 1;
//        this.end = 5;
//        //显示页数的算法
//
//        if(totalPage <=5){
//            //总页数都小于5，那么end就为总页数的值了。
//            this.end = this.totalPage;
//        }else{
//            //总页数大于5，那么就要根据当前是第几页，来判断start和end为多少了，
//            this.start = currentPage - 2;
//            this.end = currentPage + 2;
//
//            if(start < 0){
//                //比如当前页是第1页，或者第2页，那么就不如和这个规则，
//                this.start = 1;
//                this.end = 5;
//            }
//            if(end > this.totalPage){
//                //比如当前页是倒数第2页或者最后一页，也同样不符合上面这个规则
//                this.end = totalPage;
//                this.start = end - 5;
//            }
//        }
//
//
//    }

}