package ac.daffodil.l4dc1000100.budgets.UI.DataManager;

import ac.daffodil.l4dc1000100.budgets.UI.bean.AccountTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.ScheduleTable;
import ac.daffodil.l4dc1000100.budgets.UI.bean.TransactionTable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class ScheduleDataManager {
private static final String FILE_NAME = "data/schedule";

    public static void save(ArrayList<ScheduleTable> scheduleList) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(scheduleList);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            System.err.println("Cannot save to file.");
        }
    }

    public static ArrayList<ScheduleTable> load() {
        ArrayList<ScheduleTable> scheduleList = null;
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            scheduleList = (ArrayList<ScheduleTable>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            System.err.println("Cannot load from file.");
            System.err.println(ioe);
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Class not found.");
        }

        return scheduleList;
    }

    private static ArrayList<ScheduleTable> getScheduleList() {
        ArrayList<ScheduleTable> scheduleList = load();
        if (scheduleList == null) {
            scheduleList = new ArrayList<ScheduleTable>();
        }

        return scheduleList;
    }

    public static void add(ScheduleTable schedule) {
        if (schedule != null) {
            ArrayList<ScheduleTable> scheduleList = ScheduleDataManager.getScheduleList();
            scheduleList.add(schedule);
            save(scheduleList);
        }
    }

    public static void update(ScheduleTable schedule) {
        if (schedule != null) {
            ArrayList<ScheduleTable> scheduleList = ScheduleDataManager.getScheduleList();
            for (int i = 0; i < scheduleList.size(); i++) {
                ScheduleTable oldSchedule = scheduleList.get(i);
                if (oldSchedule.equals(schedule)) {
                    scheduleList.set(i, schedule);
                    save(scheduleList);
                    break;
                }
            }
        }
    }

    public static void delete(ScheduleTable schedule) {
        if (schedule != null) {
            ArrayList<ScheduleTable> scheduleList = ScheduleDataManager.getScheduleList();
            for (int i = 0; i < scheduleList.size(); i++) {
                ScheduleTable oldSchedule = scheduleList.get(i);
                if (oldSchedule.equals(schedule)) {
                    scheduleList.remove(i);
                    save(scheduleList);
                    break;
                }
            }
        }
    }

    public static ArrayList<ScheduleTable> getScheduleList(AccountTable account) {
        ArrayList<ScheduleTable> allScheduleList = load();
        ArrayList<ScheduleTable> accountScheduleList = new ArrayList<ScheduleTable>();
        if (allScheduleList != null) {
            for (int i = 0; i < allScheduleList.size(); i++) {
                ScheduleTable schedule = allScheduleList.get(i);
                if (schedule.getAccount().equals(account)) {
                    accountScheduleList.add(schedule);
                }
            }
        }

        return accountScheduleList;
    }

    public static ArrayList<ScheduleTable> getScheduleList(ArrayList<AccountTable> accountList) {
        ArrayList<ScheduleTable> scheduleList = new ArrayList<ScheduleTable>();
        for (int i = 0; i < accountList.size(); i++) {
            AccountTable account = accountList.get(i);
            ArrayList<ScheduleTable> accountScheduleList = ScheduleDataManager.getScheduleList(account);
            if (accountScheduleList != null) {
                for (int j = 0; j < accountScheduleList.size(); j++) {
                    ScheduleTable schedule = accountScheduleList.get(j);
                    scheduleList.add(schedule);
                }
            }
        }
        return scheduleList;
    }

    public static ArrayList<ScheduleTable> getUserScheduleList() {
        ArrayList<AccountTable> userAccountList = AccountDataManager.getUserAccountList();
        ArrayList<ScheduleTable> userScheduleList = getScheduleList(userAccountList);
        return userScheduleList;
    }

    public static ArrayList<ScheduleTable> getPendingScheduleList() {
        ArrayList<ScheduleTable> pendingScheduleList = new ArrayList<ScheduleTable>();
        ArrayList<ScheduleTable> userScheduleList = getUserScheduleList();

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < userScheduleList.size(); i++) {
            ScheduleTable schedule = userScheduleList.get(i);
            if (schedule.getDate() != null) {
                if (dateFormat.format(schedule.getDate()).equals(dateFormat.format(now))) {
                    pendingScheduleList.add(schedule);
                } else if (schedule.getDate().before(now)) {
                    pendingScheduleList.add(schedule);
                }
            }
        }

        return pendingScheduleList;
    }

    public static void moveScheduleToNextMonth(ScheduleTable schedule) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(schedule.getDate());
        calendar.add(Calendar.MONTH, 1);

        schedule.setDate(calendar.getTime());

        update(schedule);
    }

    public static void addScheduledTransactions() {
        ArrayList<ScheduleTable> pendingScheduleList = getPendingScheduleList();
        for (int i = 0; i < pendingScheduleList.size(); i++) {
            ScheduleTable schedule = pendingScheduleList.get(i);

            TransactionTable transaction = new TransactionTable();
            transaction.setId(UUID.randomUUID().toString());
            transaction.setAccount(schedule.getAccount());
            transaction.setAmount(schedule.getAmount());
            transaction.setCategory(schedule.getCategory());
            transaction.setDate(schedule.getDate());

            TransactionDataManager.add(transaction);

            moveScheduleToNextMonth(schedule);
        }
    }
}