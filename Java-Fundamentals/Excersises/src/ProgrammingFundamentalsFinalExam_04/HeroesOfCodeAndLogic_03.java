package ProgrammingFundamentalsFinalExam_04;

import java.util.*;

public class HeroesOfCodeAndLogic_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int count=Integer.parseInt(scanner.nextLine());
            Map<String,List<Integer>>map=new LinkedHashMap<>();
            for (int i = 0; i < count; i++) {
                String[] input= scanner.nextLine().split("\\s+");
                String name=input[0];
                map.put(name,new ArrayList<>());
                int hp=Integer.parseInt(input[1]);
                int mp=Integer.parseInt(input[2]);
                map.get(name).add(hp);
                map.get(name).add(mp);

            }
            String commands= scanner.nextLine();
            while (!commands.equals("End")){
                String command=commands.split(" - ")[0];
                String names=commands.split(" - ")[1];
                switch (command) {
                    case "CastSpell":
                        int neededMp = Integer.parseInt(commands.split(" - ")[2]);
                        String nameSpell = commands.split(" - ")[3];
                        if (map.containsKey(names)) {
                            int countMp = map.get(names).get(1);
                            if (countMp >= neededMp) {
                                countMp = countMp - neededMp;
                                map.get(names).set(1, countMp);
                                System.out.printf("%s has successfully cast %s and now has %d MP!%n", names, nameSpell, countMp);
                            } else {
                                System.out.printf("%s does not have enough MP to cast %s!%n", names, nameSpell);
                            }
                        }


                        break;


                    case "TakeDamage":
                        int damag = Integer.parseInt(commands.split(" - ")[2]);
                        String nameAta = commands.split(" - ")[3];

                        int countHp = map.get(names).get(0);
                        countHp = countHp - damag;
                        if (countHp > 0) {
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", names, damag, nameAta, countHp);
                            map.get(names).set(0, countHp);
                        } else {
                            System.out.printf("%s has been killed by %s!%n", names, nameAta);
                            map.remove(names);
                        }
                        break;


                    case "Recharge":
                        int amount = Integer.parseInt(commands.split(" - ")[2]);
                        if (map.containsKey(names)) {
                            int countMp = map.get(names).get(1);
                            if (countMp + amount > 200) {
                                int diff = 200 - countMp;
                                countMp = 200;
                                map.get(names).set(1, 200);
                                System.out.printf("%s recharged for %d MP!%n", names, diff);

                            } else {
                                countMp = countMp + amount;
                                map.get(names).set(1, countMp);
                                System.out.printf("%s recharged for %d MP!%n", names, amount);
                            }


                        }


                        break;


                    case "Heal":
                        int amount1 = Integer.parseInt(commands.split(" - ")[2]);
                        int countHp1 = map.get(names).get(0);
                        if (map.containsKey(names)) {
                            if (countHp1 + amount1 > 100) {
                                int diff1 = 100 - countHp1;
                                countHp1 = 100;
                                map.get(names).set(0,100);
                                System.out.printf("%s healed for %d HP!%n", names, diff1);
                            } else {
                                countHp1 = countHp1 + amount1;
                                map.get(names).set(0, countHp1);
                                System.out.printf("%s healed for %d HP!%n", names, amount1);
                            }


                            break;
                        }


                }

                commands= scanner.nextLine();
            }
            for (Map.Entry<String, List<Integer>> stringListEntry : map.entrySet()) {
                System.out.printf("%s%n",stringListEntry.getKey());
                System.out.printf("  HP: %d%n",stringListEntry.getValue().get(0));
                System.out.printf("  MP: %d%n",stringListEntry.getValue().get(1));

            }


        }
    }


