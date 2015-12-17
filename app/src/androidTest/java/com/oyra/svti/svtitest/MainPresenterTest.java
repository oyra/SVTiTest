package com.oyra.svti.svtitest;

import com.oyra.svti.svtitest.activities.MainPresenter;
import com.oyra.svti.svtitest.data.Pagination;
import com.oyra.svti.svtitest.data.Program;
import com.oyra.svti.svtitest.data.ProgramsList;
import com.oyra.svti.svtitest.stubs.FakeMainView;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class MainPresenterTest extends TestCase {


    public void testOnNewDataLoaded() {
        FakeMainView view = new FakeMainView();
        MainPresenter p = new MainPresenter(view);

        ProgramsList fakeData = new ProgramsList();
        initProgramsList(fakeData);
        p.onNewDataLoaded(fakeData);
        assertEquals(view.getItemsQuantity(), fakeData.getPrograms().size());
    }

    private void initProgramsList(ProgramsList fakeData) {
        List<Program> programs = new ArrayList<>();
        Pagination pagination = new Pagination();
        pagination.setTotalpages(10);
        pagination.setPage(1);

        Program p0 = new Program();
        programs.add(p0);
        programs.add(p0);
        fakeData.setPrograms(programs);
        fakeData.setPagination(pagination);
    }
}
